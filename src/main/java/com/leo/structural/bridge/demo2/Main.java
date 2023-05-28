package com.leo.structural.bridge.demo2;

/**
 * @Auther: Leo
 * @Date: 2023/5/28 16:50
 * @Description:
 */
public class Main {
    public static void main(String[] args) {
        Display d1 = new Display(new StringDisplayImpl("hello,China."));
        Display d2 = new CountDisplay(new StringDisplayImpl("hello,Word."));
        CountDisplay d3 = new CountDisplay(new StringDisplayImpl("hello,Universe."));
        d1.display();
        d2.display();
        d3.display();
        d3.multiDisplay(5);
    }

}