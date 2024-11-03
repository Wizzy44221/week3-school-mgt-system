import enums.CourseOffer;
import enums.Gender;
import model.*;
import service.impl.ApplicantServiceImpl;
import service.impl.PrincipalServiceImpl;
import service.impl.StudentServiceImpl;
import service.impl.TeachableServiceImpl;

public class SchoolSystem {
    public static void main(String[] args) {


        //Step 1
        Teacher teacher1 = new Teacher("Wizzy Chuks", 20, Gender.MALE);
        Teacher teacher2 = new Teacher("Chibuzor Ibeh", 35, Gender.FEMALE);


        //Step 2
        Student student1 = new Student("Sandra Joe", 33, Gender.FEMALE);
        Student student2 = new Student("Alice Smith", 25, Gender.FEMALE);

        //Step 3
        Course course1 = new Course(CourseOffer.JAVA);
        Course course2 = new Course(CourseOffer.DOTNET);

        //Step 4

        TeachableServiceImpl teachableService1 = new TeachableServiceImpl();
        TeachableServiceImpl teachableService2 = new TeachableServiceImpl();

        //Step 5

        Principal principal1 = new Principal("John Whick", 53, Gender.MALE);

        //Step 6

        Applicants applicants1 = new Applicants("Simon Awaogu", 90, Gender.MALE);
        Applicants applicants2 = new Applicants("Tomi Aturaka", 16, Gender.Male);

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
        principalData.display(principal1);

        System.out.println("''''''''''''''" + "\n" + "STUDENT EXPELLED DATA");
        expelStudent.expelStudent(student2, principal1);

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
