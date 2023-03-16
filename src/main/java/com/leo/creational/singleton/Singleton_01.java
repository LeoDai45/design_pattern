package com.leo.creational.singleton;

/**
 * 懒汉模式(线程不安全)
 *
 * 在类加载的时候没有直接实例化，而是调用指定实例方法的时候再进行实例化，这样就能保证不想使用的时候也不会实例化。
 *
 * @author Leo
 * @date 2023/3/16 15:23
 */
public class Singleton_01 {
    // 懒汉模式
    private static Singleton_01 instance;

    private Singleton_01(){
    }

    public static Singleton_01 getInstance(){
        if(null != instance){
            return instance;
        }
        instance = new Singleton_01();
        return instance;
    }
}
