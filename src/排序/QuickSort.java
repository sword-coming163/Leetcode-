package 排序;
import java.util.Date;

public class QuickSort {
    public void quicksort0(int[] nums)
    {
        quickSortInternal(nums,0,nums.length-1);
    }
    public void quickSortInternal(int[] arr, int l, int r) {
        if (l >= r) {
            return;
        }
        // 获取分区点，也就是 pivot 下标
        int q = partition(arr, l, r);
        // 递归调用直到有序
        quickSortInternal(arr, l, q - 1);
        quickSortInternal(arr, q + 1, r);
    }

    private int partition(int[] arr, int l, int r) {
        // 设置基准值，选择第一个，也可以随机,
        int pivot = arr[l];
        //从基准元素的下一个位置开始遍历数组，记录当前坑的位置，最后把 pivot 值放到这个坑中
        int index = l;
        for (int i = l + 1; i <= r; i++) {
            // 比基准数据小
            if (arr[i] < pivot) {
                // 坑位移动
                index++;
                // 交换数据 i 位置的 与 index 位置数据交换
                int indexValue = arr[index];
                arr[index] = arr[i];
                arr[i] = indexValue;
            }
        }
        // 最后把 pivot位置与 与 最后的坑 index 交换
        arr[l] = arr[index];
        arr[index] = pivot;
        return index;
    }
    public static void quickSort1(int[] arr,int left, int right) {
        int l = left; //左下标
        int r = right; //右下标
        //pivot 中轴值
        int pivot = arr[(left + right) / 2];
        int temp = 0; //临时变量，作为交换时使用
        //while循环的目的是让比pivot 值小放到左边
        //比pivot 值大放到右边
        while( l < r) {
            //在pivot的左边一直找,找到大于等于pivot值,才退出
            while( arr[l] < pivot) {
                l += 1;
            }
            //在pivot的右边一直找,找到小于等于pivot值,才退出
            while(arr[r] > pivot) {
                r -= 1;
            }
            //如果l >= r说明pivot 的左右两的值，已经按照左边全部是
            //小于等于pivot值，右边全部是大于等于pivot值
            if( l >= r) {
                break;
            }

            //交换
            temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;

            //如果交换完后，发现这个arr[l] == pivot值 相等 r--， 前移
            if(arr[l] == pivot) {
                r -= 1;
            }
            //如果交换完后，发现这个arr[r] == pivot值 相等 l++， 后移
            if(arr[r] == pivot) {
                l += 1;
            }
        }

        // 如果 l == r, 必须l++, r--, 否则为出现栈溢出
        if (l == r) {
            l += 1;
            r -= 1;
        }
        //向左递归
        if(left < r) {
            quickSort1(arr, left, r);
        }
        //向右递归
        if(right > l) {
            quickSort1(arr, l, right);
        }


    }


    public static void main(String[] args) {
        int[] nums = new int[]{5,8,4,6,1,0};
        int[] nums1 = new int[2400000];
        for (int i = 0; i < 2400000; i++) {
            nums1[i] = (int)(Math.random()*2400000);
        }
        QuickSort quickSort = new QuickSort();
        Date start = new Date();

//        quickSort1(nums1,0, nums1.length-1);
//        System.out.println(Arrays.toString(nums1));

        quickSort.quicksort0(nums1);
        Date end = new Date();
        System.out.println(end.getTime()-start.getTime());
    }
}
