package com.leo.creational.factory;

/**
 * @author Leo
 * @date 2023/4/18 15:27
 */
public class IDCard extends Product {
    private String owner;

    public IDCard(String owner) {
        System.out.println("制作"+ owner + "的id卡");
        this.owner = owner;
    }

    public void use() {
        System.out.println("使用"+ owner + "的id卡");
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
