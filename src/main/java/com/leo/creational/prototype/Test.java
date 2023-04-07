package com.leo.creational.prototype;

/**
 * @author Leo
 * @Description 访问类
 * @date 2023/4/7 15:00
 */
public class Test{
    public static void main(String[] args) throws CloneNotSupportedException {
        Citation citation = new Citation();//创建原型对象
        Citation clone = citation.clone();//复制原型对象
        citation.setName("张三");
        clone.setName("李四");
        citation.show(); // 张三同学,在2022学年第一学期中表现优异,被评为三好学生,特颁此状
        clone.show(); // 李四同学,在2022学年第一学期中表现优异,被评为三好学生,特颁此状
    }
}

