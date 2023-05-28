package com.leo.structural.bridge.demo2;

/**
 * @Auther: Leo
 * @Date: 2023/5/28 16:42
 * @Description:
 */
public class CountDisplay extends Display{
    public CountDisplay(DisplayImpl impl) {
        super(impl);
    }

    public void multiDisplay(int times){
        open();
        for (int i = 0; i < times; i++) {
            print();
        }
        close();
    }
}
