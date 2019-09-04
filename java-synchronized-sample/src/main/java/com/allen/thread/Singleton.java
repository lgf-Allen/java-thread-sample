package com.allen.thread;

/**
 * Double Check + volatile example.
 *
 * @Author: lingfeng
 * @Date: 2019/9/4 16:54
 */
public class Singleton {

    // volatile:1. 禁止指令重排 2. 建立内存屏障，保证线程可见性
    private static volatile Singleton singleton;

    private Singleton() {
    }

    public static Singleton getSingleton() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    /*
                      该步在多线程情况下存在重排序的风险
                      1. 分配对象的内存空间
                      2. 初始化对象
                      3. 将引用指向分配的内存空间
                     */
                    singleton = new Singleton();
                    return singleton;
                }
            }
        }
        return singleton;
    }
}
