package com.leo.creational.abstractFactory.factory;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;

/**
 * @author Leo
 * @date 2023/4/20 16:10
 */
public abstract class Page {

    protected String title;
    protected String author;
    protected ArrayList content = new ArrayList();

    public Page (String title,String author){
        this.title = title;
        this.author = author;
    }

    public void add(Item item){
        content.add(item);
    }

    public void output(){
        String fileName = title + ".html";
        Writer writer = null;
        try {
            writer = new FileWriter(fileName);
            writer.write(this.makeHtml());
            writer.close();
            System.out.println(fileName + "编写完成。");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public abstract String makeHtml();

}
