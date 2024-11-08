package service.impl;

import enums.Gender;
import model.Principal;
import model.Student;
import service.StudentService;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class StudentServiceImpl implements StudentService {


    @Override
    public void expelStudent(Student student, Principal principal) {
        if (student == null || principal == null) {
            throw new NullPointerException("Student or Principal cannot be null");
        }
        System.out.println("Student FullName : " + student.getName() + "\n" +
                "Expulsion Duration : " + "2 WEEKS" + "\n" +
                "Expelled By : " + "Principal " + principal.getName());

    }

    @Override
    public List<Student> getDetailsFromCsv() {
        try (BufferedReader bfr = new BufferedReader(new InputStreamReader(
                getClass().getClassLoader().getResourceAsStream("student.csv")))) {
            String line;
            List<Student> studentList = new ArrayList<>();
            bfr.readLine();
            bfr.readLine();
            while ((line = bfr.readLine()) != null) {
                String[] strAr = line.split(",");

                    System.out.println("STUDENT INFORMATION: " + line);

                String name = strAr[0];
                    Gender gender = Gender.valueOf(strAr[1].trim().toUpperCase());
                    int age = Integer.parseInt(strAr[2].trim());
                    int id = Integer.parseInt(strAr[3].trim());
                    Student student = new Student(name, gender, age, id);
                    studentList.add(student);

            }
            System.out.println("Total students: " + studentList.size());
            return studentList;
        } catch (IOException e) {
            System.err.println("Error reading CSV file: " + e.getMessage());
        }
        return List.of();
    }
}



