package com.leo.structural.decorator;

/**
 * @author Leo
 * @date 2023/4/24 16:08
 */
public class SideBorder extends Border {
    // 表示装饰边框的字符
    private char borderChar;

    // 通过构造函数指定Display和装饰边框字符串
    public SideBorder(Display display,char ch) {
        super(display);
        this.borderChar = ch;
    }

    // 字符数为字符串字符数  加两边边框字符数
    @Override
    public int getColumns() {
        return 1 + display.getColumns() + 1;
    }

    // 行数即被装饰物的行数
    @Override
    public int getRows() {
        return display.getRows();
    }

    // 指定的那一行的字符串为装饰物的字符串加上两侧的边框的字符
    @Override
    public String getRowText(int row) {
        return borderChar + display.getRowText(row) + borderChar;
    }
}
