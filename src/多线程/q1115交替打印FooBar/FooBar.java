package 多线程.q1115交替打印FooBar;

import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author zhang
 * @title: FooBar
 * @projectName Leetcode-
 * @description: TODO
 * @date 2021/7/30:13:34
 */
public class FooBar {
    private int n;

    public FooBar(int n) {
        this.n = n;
    }
    private Semaphore semaphore1 = new Semaphore(1);
    private Semaphore semaphore2 = new Semaphore(0);
//    ReentrantLock reentrantLock = new ReentrantLock();
//    Condition c1 = reentrantLock.newCondition();
//    Condition c2 = reentrantLock.newCondition();
    public void foo(Runnable printFoo) throws InterruptedException {
            for (int i = 0; i < n; i++) {
                semaphore1.acquire();
                // printFoo.run() outputs "foo". Do not change or remove this line.
                printFoo.run();
                semaphore2.release();

            }
    }

    public void bar(Runnable printBar) throws InterruptedException {

        for (int i = 0; i < n; i++) {
            semaphore2.acquire();
            // printFoo.run() outputs "foo". Do not change or remove this line.
            printBar.run();
            semaphore1.release();

        }
    }

    public static void main(String[] args) {
        FooBar fooBar = new FooBar(5);
        new Thread(()->{
            try {
                fooBar.foo(()->{
                    System.out.println("foo");
                });
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        },"A").start();
        new Thread(()->{
            try {
                fooBar.bar(()->{
                    System.out.println("bar");
                });
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        },"B").start();

    }
}
