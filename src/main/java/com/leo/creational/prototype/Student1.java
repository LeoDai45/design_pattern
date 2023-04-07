package com.leo.creational.prototype;

import java.io.Serializable;

/**
 * @author Leo
 * @date 2023/4/7 15:43
 */
public class Student1 implements Cloneable, Serializable {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
