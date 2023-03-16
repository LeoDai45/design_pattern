package com.leo.creational.singleton;

import java.util.concurrent.atomic.AtomicReference;

/**
 * CAS AtomicReference (线程安全)
 * @author Leo
 * @date 2023/3/16 16:53
 */
public class Singleton_06 {
    private static final AtomicReference<Singleton_06> INSTANCE = new AtomicReference<>();
    private Singleton_06(){
    }

    public static final Singleton_06 getInstance(){
        for (;;){
            Singleton_06 instance = INSTANCE.get();
            if(null != instance) return instance;
            INSTANCE.compareAndSet(null,new Singleton_06());
            return INSTANCE.get();
        }
    }

    public static void main(String[] args) {
        System.out.println(Singleton_06.getInstance());
        // com.leo.creational.singleton.Singleton_06@4554617c

        System.out.println(Singleton_06.getInstance());
        // com.leo.creational.singleton.Singleton_06@4554617c
    }
}
