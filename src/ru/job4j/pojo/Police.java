package ru.job4j.pojo;

import java.util.Date;

public class Police {
    public static void main(String[] args) {
        License license = new License();
        license.setOwner("Ivan Zotov");
        license.setModel("Toyota");
        license.setCode("x111xx");
        license.setCreated(new Date());

        System.out.println(license.getOwner() + " has car - " + license.getModel() + " : " + license.getCode());
    }
}
