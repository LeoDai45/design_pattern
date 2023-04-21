package com.leo.creational.builder;

/**
 * @author Leo
 * @date 2023/4/21 14:30
 * @Description 声明了一个编写文档的方法的抽象类。
 */
public abstract class Builder {
    // 编写标题
    public abstract void makeTitle(String title);

    // 编写字符串
    public abstract void makeString(String str);

    // 编写条目
    public abstract void makeItems(String[] items);

    // 完成文档编写
    public abstract void close();

}
