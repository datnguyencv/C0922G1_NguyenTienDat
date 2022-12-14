package student_manager_mvc.service;

import java.io.IOException;

public interface IStudentService {
    void addStudent() throws IOException, ClassNotFoundException;

    void displayStudent() throws IOException;

    void removeStudent() throws IOException;

    void changeStudenInfo() throws IOException;

    void findIdStudent() throws IOException;

    void findNameStudent() throws IOException;

    void sortNameStudent() throws IOException;

}
