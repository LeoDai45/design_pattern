package com.leo.creational.builder;

/**
 * @author Leo
 * @date 2023/4/21 14:35
 * @Description 使用Builder类中声明的方法来编写文档
 */
public class Director {

    private Builder builder;

    public Director(Builder builder){   // 接收参数是Builder类的子类
        this.builder = builder;         // 所以可以将其保存在builder字段中
    }

    public void construct(){                                // 编写文档
        builder.makeTitle("Greeting");                      // 标题
        builder.makeString("从早上至下午");                   // 字符串
        builder.makeItems(new String[]{"早上好","下午好"});   // 条目

        builder.makeString("晚上");                         // 其他字符串
        builder.makeItems(new String[]{                    // 其他条目
                "晚上好",
                "晚安",
                "再见。"
        });
        builder.close();                                  // 完成文档
    }
}
