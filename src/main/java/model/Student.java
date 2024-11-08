package model;

import baseClass.Person;
import enums.Gender;

public class Student extends Person {

    public Student(String name,  Gender gender, int age, int Id) {
        super(name, gender, age, Id);
    }
    @Override
    public String toString() {
        return "Student" +
                "name='" + super.getName() + '\'' +
                ", gender=" + super.getGender() +
                ", age=" + super.getAge() +
                ", Id=" + super.getId()
                ;
    }
}
