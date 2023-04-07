package com.leo.creational.prototype;

/**
 * @author Leo
 * @Description 对于浅拷贝来说,具体原型对象的属性只能是基本数据类型和String类型,
 * @date 2023/4/7 15:05
 */
public class Citation1 implements Cloneable {
    private Student student;

    public void setStudent(Student student) {
        this.student = student;
    }

    public Student getStudent() {
        return student;
    }

    public void show() {
        System.out.println(student.getName() + "同学,在2022学年第一学期中表现优异,被评为三好学生,特颁此状");
    }

    protected Citation1 clone() throws CloneNotSupportedException {
        return (Citation1) super.clone();
    }

}




