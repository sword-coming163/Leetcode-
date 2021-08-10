package 多线程.按序打印;

/**
 * @author zhang
 */
public class Print_ABC {
    private int nums = 0;
    private static final Object obj = new Object();
    private void print(int target){
        for (int i = 0; i < 100; i++) {
            synchronized (obj){
                try {
                    while (nums%3!=target){
                        obj.wait();
                    }
                }catch (Exception e){
                    e.printStackTrace();
                }
                nums++;
                System.out.println(Thread.currentThread().getName());
                obj.notifyAll();
            }
        }

    }
    private void print_num(int target){
        for (int i = 0; i < 50; i++) {
            synchronized (obj){
                while (nums%2==target){
                    System.out.println(nums);
                    nums++;
                    obj.notifyAll();
                }
                try {
                    obj.wait();
                }catch (Exception e){
                    e.printStackTrace();
                }

            }
        }

    }

    public static void main(String[] args) {
        Print_ABC print_abc = new Print_ABC();

        new Thread(()->{
            print_abc.print_num(0);
        },"A").start();
        new Thread(()->{
            print_abc.print_num(1);
        },"B").start();
//        new Thread(()->{
//            print_abc.print(2);
//        },"C").start();
//        ExecutorService service = Executors.newFixedThreadPool(3);
//        service.submit(()->{
//            print_abc.print(0);
//        });
//        service.submit(()->{
//            print_abc.print(2);
//        });
//        service.submit(()->{
//            print_abc.print(1);
//        });
    }
}
