package com.leo.structural.adapter.objAdapter;

/**
 * @author Leo
 * @date 2023/4/24 11:27
 */
public class Banner {

    private String string;

    public Banner(String string) {
        this.string = string;
    }

    public void showWithParen(){
        System.out.println("(" + string + ")");
    }

    public void showWithAster(){
        System.out.println("*" +string + "*");
    }
}
