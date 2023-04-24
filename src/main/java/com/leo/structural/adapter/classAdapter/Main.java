package com.leo.structural.adapter.classAdapter;

/**
 * @author Leo
 * @date 2023/4/24 11:32
 */
public class Main {
    public static void main(String[] args) {
        Print p = new PrintBanner("hello");
        p.printWeak();
        p.printStrong();
    }
}
