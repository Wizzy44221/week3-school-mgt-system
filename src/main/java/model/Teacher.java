package model;

import baseClass.Person;
import enums.Gender;

public class Teacher extends Person {


    public Teacher(String name, Gender gender, int age, int Id) {
        super(name, gender, age, Id);
    }
}
