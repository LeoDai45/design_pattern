package com.leo.creational.abstractFactory.factory;

/**
 * @author Leo
 * @date 2023/4/20 15:13
 * @Description 抽象地标识HTML的超链接类
 */
public abstract class Link extends Item {
    protected String url;

    public Link(String caption, String url) {
        super(caption);
        this.url = url;
    }
}
