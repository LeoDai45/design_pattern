package com.leo.creational.singleton;

/**
 * 懒汉模式(线程不安全)
 *
 * 由于把锁加到方法中，所有的访问因为需要锁占用，导致资源浪费。
 * @author Leo
 * @date 2023/3/16 15:42
 */
public class Singleton_02 {
    private static Singleton_02 instance;

    private Singleton_02 (){
    }

    public static synchronized Singleton_02 getInstance() {
        if(null == instance){
            instance = new Singleton_02();
        }
        return instance;
    }
}
