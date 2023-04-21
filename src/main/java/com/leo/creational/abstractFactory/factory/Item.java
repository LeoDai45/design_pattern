package com.leo.creational.abstractFactory.factory;

/**
 * @author Leo
 * @date 2023/4/20 15:09
 * @description Link类和Tray的父类
 */
public abstract class Item {

    protected String caption; // 标题

    public Item(String caption){
        this.caption = caption;
    }

    //抽象方法需要子类实现
    public abstract String makeHTML();

}
