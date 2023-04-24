package com.leo.structural.adapter.classAdapter;

/**
 * 扮演适配器角色
 * @author Leo
 * @date 2023/4/24 11:30
 */
public class PrintBanner extends Banner implements Print {
    public PrintBanner(String string) {
        super(string);
    }

    @Override
    public void printWeak() {
        showWithParen();
    }

    @Override
    public void printStrong() {
        showWithAster();
    }
}
