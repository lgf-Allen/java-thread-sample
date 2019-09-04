package com.allen.thread;

/**
 * 1. synchronized method: 方法级的同步是隐式的，即无需通过字节码指令来控制，它实现在方法调用和返回操作之间。
 * 虚拟机可以从方法常量池的方法表结构中的ACC_SYNCHRONIZED访问标志得知一个方法是否声明为同步方法.
 * <p>
 * 2. synchronized block: 通过字节码指令(monitorenter和monitorexist)来控制
 * <p>
 * 3. 可通过javap -v 来反编译class文件查看到1和2的情况
 */
public class SynchronizedDemo {

    private static final Object lock = new Object();

    public static synchronized void syncStaticMethod() {
        System.out.println("Synchronized static method");
    }

    public synchronized void syncMethod() {
        System.out.println("Synchronized method.");
    }

    public void syncBlockClazzLock() {
        synchronized (SynchronizedDemo.class) {
            System.out.println("synch block by Class.");
        }
    }

    public void syncBlockByInstance() {
        synchronized (lock) {
            System.out.println("Synch block lock by instance");
        }
    }


}
