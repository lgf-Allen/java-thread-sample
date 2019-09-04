package com.allen.thread;

import java.util.concurrent.TimeUnit;

/**
 * 该类在执行main方法时会引起deadLock
 * 可通过 *jstack -l pid* 查看到具体的deadLock情况
 *
 * @Author: lingfeng
 * @Date: 2019/9/4 16:54
 */
public class DeadLock {

    private static final Object objectA = new Object();
    private static final Object objectB = new Object();

    public static void main(String[] args) {
        Thread threadA = new Thread(() -> {
            synchronized (objectA) {
                try {
                    System.out.println("lock is objectA, methodA is running");
                    TimeUnit.MILLISECONDS.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (objectB) {
                    System.out.println("lock is objectB, methodA is running");
                }
            }
        });
        Thread threadB = new Thread(() -> {
            synchronized (objectB) {
                System.out.println("lock is objectB, methodB is running");
                synchronized (objectA) {
                    System.out.println("lock is objectA, methodA is running");
                }
            }
        });
        threadA.start();
        threadB.start();
    }
}
