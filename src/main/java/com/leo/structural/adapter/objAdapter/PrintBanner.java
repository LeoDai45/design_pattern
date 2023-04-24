package com.leo.structural.adapter.objAdapter;

/**
 * @author Leo
 * @date 2023/4/24 11:38
 */
public class PrintBanner extends Print {
    private Banner banner;

    public PrintBanner(String string) {
        this.banner = new Banner(string);
    }

    public void printWeak(){
        banner.showWithParen();
    }

    @Override
    public void printStrong() {
        banner.showWithAster();
    }
}
