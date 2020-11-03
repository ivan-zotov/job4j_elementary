package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Ivan Zotov");
        student.setGroup("Java course");
        student.setAdmission(new Date());

        System.out.println("Student: " + student.getName() + " enrolled in a "
                + student.getGroup() + " " + student.getAdmission());
    }
}
