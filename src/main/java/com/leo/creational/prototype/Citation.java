package com.leo.creational.prototype;

/**
 * @author Leo
 * @Description 具体原型类
 * @date 2023/4/7 14:56
 */
public class Citation implements Cloneable{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show(){
        System.out.println(name+"同学，在2022年第一学期中表现优异，被评为三好学生，特颁此状");
    }

     public Citation clone() throws CloneNotSupportedException{
        return (Citation) super.clone();
     }
}
