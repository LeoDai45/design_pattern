package com.leo.creational.prototype;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @author Leo
 * @date 2023/4/7 15:52
 */
public class CitationTest1 {
    public static void main(String[] args) throws Exception {
        Citation2 citation2 = new Citation2();
        Student1 student1 = new Student1();
        student1.setName("张三");
        citation2.setStudent(student1);
        /*序列化对象*/
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\b.txt"));//开启对象输出流
        oos.writeObject(citation2);//序列化对象
        oos.close();//关闭对象输出流
        /*反序列化对象*/
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\b.txt"));//开启对象输入流
        Citation2 clone = (Citation2 ) ois.readObject();//反序列化对象
        ois.close();//关闭对象输入流
        clone.getStudent().setName("李四");
        citation2.show();//张三同学,在2022学年第一学期中表现优异,被评为三好学生,特颁此状
        clone.show();//李四同学,在2022学年第一学期中表现优异,被评为三好学生,特颁此状
    }
}
