package model;

import baseClass.Person;
import enums.Gender;

public class Principal extends Person {

    private String name;
    private  Gender gender;
    private int age;

    public Principal(String name, Gender gender, int age) {

       super(name, gender, age);

       this.name = name;
       this.gender = gender;
       this.age = age;

    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Gender getGender() {
        return gender;
    }

    @Override
    public int getAge() {
        return age;
    }
}
