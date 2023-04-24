package com.leo.structural.decorator;

/**
 * @author Leo
 * @date 2023/4/24 15:40
 */
public abstract class Border extends Display {
    // 表示被装饰物
    protected Display display;

    // 在生成实例时通过参数指定被修饰物
    public Border(Display display) {
        this.display = display;
    }

}
