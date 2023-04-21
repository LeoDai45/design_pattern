package com.leo.creational.abstractFactory.listFactory;

import com.leo.creational.abstractFactory.factory.Item;
import com.leo.creational.abstractFactory.factory.Page;

import java.util.Iterator;

/**
 * @author Leo
 * @date 2023/4/21 9:44
 */
public class ListPage extends Page {
    public ListPage(String title, String author) {
        super(title, author);
    }

    @Override
    public String makeHtml() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("<html><head><title>" + title +"</title></head>\n");
        buffer.append("<body>\n");
        buffer.append("<h1>" + title +"</h1>\n");
        buffer.append("<ul>\n");
        Iterator it = content.iterator();
        while(it.hasNext()){
            Item item = (Item) it.next();
            buffer.append(item.makeHTML());
        }
        buffer.append("</ul>\n");
        buffer.append("<hr><address>"+ author +"</address>");
        buffer.append("</body></html>\n");
        return buffer.toString();
    }
}
