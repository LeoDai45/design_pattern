package com.leo.structural.flyweight.cacheOptimize;

/**
 * 商品活动库存信息类
 *
 * @author Leo
 * @date 2023/6/28 16:07
 */

public class Stock {
    private int total;
    private int used;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getUsed() {
        return used;
    }

    public void setUsed(int used) {
        this.used = used;
    }
}
