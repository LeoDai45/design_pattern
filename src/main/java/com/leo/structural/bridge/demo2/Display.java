package com.leo.structural.bridge.demo2;

/**
 * @Auther: Leo
 * @Date: 2023/5/28 16:38
 * @Description:
 */
public class Display {
    private DisplayImpl impl;

    public Display(DisplayImpl impl){
        this.impl = impl;
    }

    public void open(){
        impl.rawOpen();
    }
    public void print(){
        impl.rawPrint();
    }
    public void close(){
        impl.rawClose();
    }

    public final void display(){
        open();
        print();
        close();
    }


}
