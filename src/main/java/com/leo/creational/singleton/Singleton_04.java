package com.leo.creational.singleton;

/**
 * 使用类的内部类(线程安全)
 * 使用类的静态内部类实现的单例模式，既保证了线程安全，又保证了懒汉模式，同时不会因为加锁而降低性能。因为静态内部类在外部类加载时，并不需要立即加载
 * 内部类，内部类不被加载则不去初始化instance，故而不占内存，只有getInstance被调用，才会去初始化instance，第一次调用getInstance()方法会导
 * 致虚拟机加载SingletonHolder类，不仅保证了线程安全， 也保证了单例的唯一性，同时也延迟了单里的实例化。
 * @author Leo
 * @date 2023/3/16 16:30
 */
public class Singleton_04 {
    private static class SingletonHolder {
        private static Singleton_04 instance = new Singleton_04();
    }
    private Singleton_04(){
    }
    public static Singleton_04 getInstance(){
        return SingletonHolder.instance;
    }
}
