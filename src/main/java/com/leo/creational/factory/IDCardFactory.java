package com.leo.creational.factory;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Leo
 * @date 2023/4/18 15:30
 */
public class IDCardFactory extends Factory {
    private List owners = new ArrayList();

    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

    protected void registerProduct(Product product) {
        owners.add(((IDCard)product).getOwner());
    }

    public List getOwners(){
        return owners;
    }
}
