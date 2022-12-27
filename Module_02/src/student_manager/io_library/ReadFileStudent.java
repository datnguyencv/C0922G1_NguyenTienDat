package student_manager.io_library;

import student_manager.model.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFileStudent {
    private static final String PATH_FILE = "src/student_manager/datas/list_student.csv";

    public static List<Student> readFileStudent() throws IOException {
        List<Student> students = new ArrayList<>();

        File file = new File(PATH_FILE);

        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        String line = "";

        while ((line = bufferedReader.readLine()) != null){
            String[] splitLine = line.split(",");
            Student student = new Student(splitLine);
            students.add(student);
        }
            return students;
    }
}
