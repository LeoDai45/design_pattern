package com.leo.creational.abstractFactory.factory;

import java.util.ArrayList;

/**
 * @author Leo
 * @date 2023/4/20 15:24
 */
public abstract class Tray extends Item {

    protected ArrayList tray = new ArrayList();

    public Tray(String caption) {
        super(caption);
    }

    public void add(Item item){
        tray.add(item);
    }
}
