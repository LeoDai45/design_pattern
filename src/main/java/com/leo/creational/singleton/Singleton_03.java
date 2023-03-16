package com.leo.creational.singleton;

/**
 * 饿汉模式(线程安全)
 *
 * 程序启动时直接运行加载，后续有外部需要使用时，获取即可。非懒加载，无论程序中是否有用到都会在程序启动之初进行创建。
 *
 * @author Leo
 * @date 2023/3/16 16:20
 */
public class Singleton_03 {
    private static Singleton_03 instance = new Singleton_03();

    private Singleton_03(){
    }

    public static Singleton_03 getInstance(){
        return instance;
    }
}
