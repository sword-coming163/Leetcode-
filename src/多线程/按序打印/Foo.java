package 多线程.按序打印;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author zhang
 * @title: Foo
 * @projectName Leetcode-
 * @description: TODO
 * @date 2021/7/30:11:10
 */
public class Foo {
    ReentrantLock lock;
    Condition c1;
    Condition c2;
    Condition c3;
    public Foo() throws InterruptedException {
        lock = new ReentrantLock();
        c1 = lock.newCondition();
        c2 = lock.newCondition();
        c3 = lock.newCondition();
        c1.signal();
        c2.await();
        c3.await();
    }

    public void first(Runnable printFirst) throws InterruptedException {
        try{
            lock.lock();
            // printFirst.run() outputs "first". Do not change or remove this line.
            printFirst.run();
            c2.signal();
        }finally {
            lock.unlock();
        }
    }

    public void second(Runnable printSecond) throws InterruptedException {

        try{
            lock.lock();
            // printFirst.run() outputs "first". Do not change or remove this line.
            printSecond.run();
            c3.signal();
        }finally {
            lock.unlock();
        }
    }

    public void third(Runnable printThird) throws InterruptedException {

        try{
            lock.lock();
            // printFirst.run() outputs "first". Do not change or remove this line.
            printThird.run();
            c1.signal();
        }finally {
            lock.unlock();
        }
    }
}
