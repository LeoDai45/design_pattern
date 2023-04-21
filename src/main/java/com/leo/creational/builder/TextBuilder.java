package com.leo.creational.builder;

/**
 * @author Leo
 * @date 2023/4/21 14:45
 */
public class TextBuilder extends Builder {
    private StringBuffer buffer = new StringBuffer();       // 文档内容保存在该字段中

    @Override
    public void makeTitle(String title) {                   // 纯文本的标题
        buffer.append("===========================\n");     // 装饰线
        buffer.append("[" + title +"]\n");                  // 未标题增加 [ ]
        buffer.append("\n");                                // 换行
    }

    @Override
    public void makeString(String str) {                    // 纯文本的字符串
        buffer.append('□' + str + "\n");                    // 为字符串添加 □
        buffer.append("\n");                                // 换行
    }

    @Override
    public void makeItems(String[] items) {                 // 纯文本的条目
        for(int i = 0; i<items.length; i++){
            buffer.append("·" + items[i] + "\n");           // 为文本添加·
        }
        buffer.append("\n");
    }

    @Override
    public void close() {                                   // 完成文档
        buffer.append("=========================\n");       // 装饰线
    }

    public String getResult(){                              // 完成的文档
        return buffer.toString();
    }
}
