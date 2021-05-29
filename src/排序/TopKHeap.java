package 排序;

public class TopKHeap {
    public int[] getLeastNumbers(int[] arr, int k) {
        if(arr == null || arr.length == 0 || k == 0) return new int[0];
        int[] result = new int[k];
        int i = 0;
        while(i < k){
            result[i] = arr[i];
            i++;
        }
        buildHeap(result);
        while(i < arr.length){
            if(arr[i] < result[0]){
                result[0] = arr[i];
                adjust(result, 0);
            }
            i++;
        }
        return result;
    }
    public void buildHeap(int[] arr){
        for(int i = arr.length / 2 - 1; i >= 0; i--){
            adjust(arr, i);
        }
    }
    public void adjust(int[] arr, int i){
        int maxIndex = i;
        int len = arr.length;
        if(2*i+1 < len && arr[2*i+1] > arr[maxIndex]) maxIndex = 2*i+1;
        if(2*i+2 < len && arr[2*i+2] > arr[maxIndex]) maxIndex = 2*i+2;
        if(maxIndex != i){
            swap(arr, maxIndex, i);
            adjust(arr, maxIndex);
        }
    }
    public void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
