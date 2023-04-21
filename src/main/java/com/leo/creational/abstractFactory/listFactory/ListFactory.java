package com.leo.creational.abstractFactory.listFactory;

import com.leo.creational.abstractFactory.factory.Factory;
import com.leo.creational.abstractFactory.factory.Link;
import com.leo.creational.abstractFactory.factory.Page;
import com.leo.creational.abstractFactory.factory.Tray;

/**
 * @author Leo
 * @date 2023/4/21 9:17
 */
public class ListFactory extends Factory {

    @Override
    public Link createLink(String caption, String url) {
        return new ListLink(caption, url);
    }

    @Override
    public Tray createTray(String caption) {
        return new ListTray(caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new ListPage(title, author);
    }
}
