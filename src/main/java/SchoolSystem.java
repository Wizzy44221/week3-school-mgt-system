import baseClass.Person;
import enums.CourseOffer;
import enums.Gender;
import model.*;
import service.StudentService;
import service.impl.ApplicantServiceImpl;
import service.impl.PrincipalServiceImpl;
import service.impl.StudentServiceImpl;
import service.impl.TeachableServiceImpl;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public class SchoolSystem {
    public static void main(String[] args) throws IOException {


        //Step 1
        Teacher teacher1 = new Teacher("Wizzy Chuks", Gender.MALE, 20, 876555);
        Teacher teacher2 = new Teacher("Chibuzor Ibeh", Gender.FEMALE, 37, 545566);


        //Step 2
        Student student1 = new Student("Sandra Joe", Gender.FEMALE, 33, 233344);
        Student student2 = new Student("Alice Smith", Gender.FEMALE, 25, 344555);

        //Step 3
        Course course1 = new Course(CourseOffer.JAVA);
        Course course2 = new Course(CourseOffer.DOTNET);

        //Step 4

        TeachableServiceImpl teachableService1 = new TeachableServiceImpl();
        TeachableServiceImpl teachableService2 = new TeachableServiceImpl();

        // CSV student

        StudentService studentService = new StudentServiceImpl();
        List<Student> students = studentService.getDetailsFromCsv();
        System.out.println("''''''''''''''");


        // CSV teacher

        TeachableServiceImpl teacherService = new TeachableServiceImpl();
        List<Teacher> teachers = teacherService.getDetailsFromCsv();


        //Step 5

            Person principal = new Principal("John Whick", Gender.MALE, 75);

            //Step 6

            Applicants applicants1 = new Applicants("Simon Awaogu", Gender.MALE, 90, 456677);
            Applicants applicants2 = new Applicants("Tomi Aturaka", Gender.Male, 16, 233445);

            ApplicantServiceImpl applicantData = new ApplicantServiceImpl();

            PrincipalServiceImpl principalData = new PrincipalServiceImpl();

            StudentServiceImpl expelStudent = new StudentServiceImpl();

            System.out.println("''''''''''''''''''''''" + "\n" + "TEACHER DATA");
            teachableService1.teachCourse(teacher1, course1);


            System.out.println("'''''''''''''''''''''''''" + "\n" + "TEACHER DATA");
            teachableService2.teachCourse(teacher2, course2);


            System.out.println("'''''''''''''''''''''''''''" + "\n" + "STUDENT DATA");
            teachableService1.takeCourse(student1, course1);

            System.out.println("\n");
            teachableService1.takeCourse(student2, course2);

            System.out.println("''''''''''''''" + "\n" + "PRINCIPAL DATA");
            principalData.display((Principal) principal);

            System.out.println("''''''''''''''" + "\n" + "STUDENT EXPELLED DATA");
            expelStudent.expelStudent(student2, (Principal) principal);

            System.out.println("''''''''''''''''''" + "\n" + "APPLICANT DATA");
            applicantData.displayApplicantData(applicants1);
            System.out.println("\n");
            applicantData.displayApplicantData(applicants2);


            System.out.println("'''''''''''''''''''''" + "\n" + "SUCCESSFUL ADMISSION DATA");
            applicantData.admitStudent(applicants1);

            System.out.println("'''''''''''''''''''''" + "\n" + "DENIED ADMISSION DATA");
            applicantData.admitStudent(applicants2);


        }


    }
