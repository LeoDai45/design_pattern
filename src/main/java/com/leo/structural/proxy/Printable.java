package com.leo.structural.proxy;

/**
 * @author Leo
 * @date 2023/4/27 16:50
 */
public interface Printable {
    public abstract void setPrinterName(String name);   //  设置名字
    public abstract  String getPrinterName();           //  获取名字
    public abstract void print(String string);          //  显示文字
}
