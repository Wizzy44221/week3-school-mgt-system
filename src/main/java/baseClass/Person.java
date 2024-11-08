package baseClass;

import enums.Gender;

abstract public class Person {

    private String name;

    private Gender gender;

    private int age;

    private int Id;

    public Person() {
    }

    public Person(String name, Gender gender, int age, int id) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        Id = id;
    }

    public Person(String name, Gender gender, int age) {
    }

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return Id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", Id=" + Id +
                '}';
    }
}