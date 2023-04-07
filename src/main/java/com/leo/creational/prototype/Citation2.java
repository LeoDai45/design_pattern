package com.leo.creational.prototype;

import java.io.Serializable;

/**
 * @author Leo
 * @date 2023/4/7 15:39
 */
public class Citation2 implements Cloneable, Serializable {
    private Student1 student;

    public void setStudent(Student1 student) {
        this.student = student;
    }

    public Student1 getStudent() {
        return student;
    }

    public void show() {
        System.out.println(student.getName() + "同学,在2022学年第一学期中表现优异,被评为三好学生,特颁此状");
    }

    protected Citation2 clone() throws CloneNotSupportedException {
        Citation2 deepClone = (Citation2) super.clone();
        deepClone.student = (Student1)student.clone();
        return (Citation2) super.clone();
    }
}
