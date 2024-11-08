package model;

import baseClass.Person;
import enums.Gender;

public class Applicants extends Person {

    public Applicants() {
    }

    public Applicants(String name, Gender gender, int age, int Id) {
        super(name, gender, age, Id);
    }
}
