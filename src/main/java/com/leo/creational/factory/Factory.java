package com.leo.creational.factory;

/**
 * @author Leo
 * @date 2023/4/18 15:24
 */
public abstract class Factory {
    public final Product create(String owner){
        Product p = createProduct(owner);
        registerProduct(p);
        return p;
    }

    protected abstract Product createProduct(String owner);
    protected abstract void registerProduct(Product product);

}
