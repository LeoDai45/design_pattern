package com.leo.creational.singleton;

/**
 * @author Leo
 * @date 2023/3/16 14:54
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Start.");
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        if(obj1 == obj2){
            System.out.println("obj1与obj2 是 相同的实例。");
        }else {
            System.out.println("obj1与obj2 不是 相同的实例。");
        }
        System.out.println("End.");
    }
}
