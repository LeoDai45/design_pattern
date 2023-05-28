package com.leo.structural.bridge.demo2;

import java.nio.charset.StandardCharsets;

/**
 * @Auther: Leo
 * @Date: 2023/5/28 16:44
 * @Description:
 */
public class StringDisplayImpl extends DisplayImpl{
    private String string;          // 要显示的字符串
    private int width;              //  要以字节单位计算出的字符串宽度

    public StringDisplayImpl(String string){    // 构造函数接受要显示的字符串string
        this.string = string;                   // 将它保存在字段中
        this.width = string.getBytes(StandardCharsets.UTF_8).length;    // 把字符串的宽度也保存在字段中，以供使用
    }

    @Override
    public void rawOpen() {
        printLine();
    }

    @Override
    public void rawPrint() {
        System.out.println("|" + string + "|");
    }

    @Override
    public void rawClose() {
        printLine();
    }

    private void printLine(){
        System.out.print("+");    // 要显示出来的方框的角"+"
        for (int i = 0; i < width; i++) {   // 显示width个"-"
            System.out.print("-");        // 将其用作方框的边框
        }
        System.out.println("+");            // 显示用来表示方框的角"+"
    }
}
