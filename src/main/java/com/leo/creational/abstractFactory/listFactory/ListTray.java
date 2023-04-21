package com.leo.creational.abstractFactory.listFactory;

import com.leo.creational.abstractFactory.factory.Item;
import com.leo.creational.abstractFactory.factory.Tray;

import java.util.Iterator;

/**
 * @author Leo
 * @date 2023/4/21 9:37
 */
public class ListTray extends Tray {
    public ListTray(String caption) {
        super(caption);
    }

    @Override
    public String makeHTML() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("<li>\n");
        buffer.append(caption + "\n");
        buffer.append("<ul>\n");
        Iterator it  = tray.iterator();
        while(it.hasNext()){
            Item item = (Item) it.next();
            buffer.append(item.makeHTML());
        }
        buffer.append("/<ul>\n");
        buffer.append("</li>\n");
        return buffer.toString();
    }
}
