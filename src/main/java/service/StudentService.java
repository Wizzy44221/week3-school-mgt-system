package service;

import model.Principal;
import model.Student;

import java.io.IOException;
import java.util.List;

public interface StudentService {

    void expelStudent (Student student, Principal principal);

    List<Student> getDetailsFromCsv() throws IOException;
}
