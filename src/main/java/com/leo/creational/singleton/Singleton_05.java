package com.leo.creational.singleton;

/**
 * 双检锁DCL (线程安全)
 * 方法级别锁的优化，减少了 获取实例的耗时。同时满足了懒汉模式。
 * @author Leo
 * @date 2023/3/16 16:48
 */
public class Singleton_05 {
    private static volatile Singleton_05 instance;
    private Singleton_05(){}
    public static Singleton_05 getInstance(){
        if(null != instance){
            return instance;
        }
        synchronized (Singleton_05.class){
            if(null == instance){
                instance = new Singleton_05();
            }
        }
        return instance;
    }
}
