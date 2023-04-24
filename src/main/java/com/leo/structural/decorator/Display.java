package com.leo.structural.decorator;

/**
 * @author Leo
 * @date 2023/4/24 15:02
 */
public abstract class Display {

    // 获取横向字符串
    public abstract int getColumns();
    // 获取纵向字符串
    public abstract int getRows();
    // 获取第row行的字符串
    public abstract String getRowText(int row);

    public final void show(){
        for(int i=0; i<getRows();i++){
            System.out.println(getRowText(i));
        }
    }
}
