package com.leo.creational.singleton;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * 静态类使用
 * @author Leo
 * @date 2023/3/16 15:15
 */
public class Singleton_00 {
    // 第一次运行时直接初始化Map类，在不需要维持任何状态的情况下，仅仅用于全局访问，使用静态方法更加方便。
    // 在需要被继承及维持一些特定状态的情况下，适合使用单例模式
    public static Map<String,String> cache = new ConcurrentHashMap<String, String>();
}
