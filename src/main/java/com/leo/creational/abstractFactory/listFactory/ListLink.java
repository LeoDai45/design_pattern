package com.leo.creational.abstractFactory.listFactory;

import com.leo.creational.abstractFactory.factory.Link;

/**
 * @author Leo
 * @date 2023/4/21 9:18
 */
public class ListLink extends Link {
    public ListLink(String caption, String url) {
        super(caption, url);
    }

    @Override
    public String makeHTML() {
        return "<li><a href=\""+ url + "\">" +caption + "</a></li>\n";
    }
}
