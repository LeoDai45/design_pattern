package com.leo.creational.prototype;

public class CitationTest{
    public static void main(String[] args) throws Exception {
        Citation1 citation = new Citation1();//创建原型对象
        Student student = new Student();
        student.setName("张三");
        citation.setStudent(student);
        Citation1 clone = citation.clone();//拷贝原型对象
        clone.getStudent().setName("李四");
        citation.show(); //李四同学,在2022学年第一学期中表现优异,被评为三好学生,特颁此状

        /**
         * 因为Object类中提供了clone()方法实现的是浅克隆,
         * 对于非基本类型属性仍指向原有属性所指向的内存地址,
         * 原型类中的student对象和克隆类中的对象是同一个对象,
         * 当修改克隆类的student对象时也会修改原型类中的student对象
         */
        clone.show(); //李四同学,在2022学年第一学期中表现优异,被评为三好学生,特颁此状
    }
}
