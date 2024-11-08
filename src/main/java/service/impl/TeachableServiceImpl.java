package service.impl;

import enums.Gender;
import model.Course;
import model.Student;
import model.Teacher;
import service.CourseService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TeachableServiceImpl implements CourseService {
    @Override
    public void teachCourse(Teacher teacher, Course course) {
        System.out.println("Full Name : " + teacher.getName() +
                "\n" + "Gender : " + teacher.getGender() + "\n" +
                "Age : " + teacher.getAge() + "\n" +
                "Course Taught : " + course.getCourseOffer());
    }

    @Override
    public void takeCourse(Student student, Course course) {
        System.out.println("Full Name : " + student.getName() +
                "\n" + "Gender : " + student.getGender() + "\n" +
                "Age : " + student.getAge() + "\n" +
                "Course Taught : " + course.getCourseOffer());
    }


    @Override
    public List<Teacher> getDetailsFromCsv() {
        try (BufferedReader bfr = new BufferedReader(new InputStreamReader(
                getClass().getClassLoader().getResourceAsStream("teacher.csv")))) {
            String line;
            List<Teacher> teacherList = new ArrayList<>();
            bfr.readLine();
            bfr.readLine();
            while ((line = bfr.readLine()) != null) {
                String[] strAr = line.split(",");
                    System.out.println("TEACHERS INFORMATION: " + line);

                String name = strAr[0];
                    Gender gender = Gender.valueOf(strAr[1].trim().toUpperCase());
                    int age = Integer.parseInt(strAr[2].trim());
//                    int id = Integer.parseInt(strAr[3].trim());
                    Teacher teacher = new Teacher(name, gender, age, new Random().nextInt());
                    teacherList.add(teacher);
            }
            System.out.println("Total teachers: " + teacherList.size());
            return teacherList;
        } catch (IOException e) {
            System.err.println("Error reading CSV file: " + e.getMessage());
        }
        return List.of();
    }
}















