package student_manager_mvc.service.read_and_write;

import student_manager_mvc.model.Student;
import student_manager_mvc.model.Teacher;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFileUtil {
    private static List<String> readFile(String path) throws IOException {
        File file = new File(path);
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        List<String> strings = new ArrayList<>();
        while ((line = bufferedReader.readLine()) != null) {
            strings.add(line);
        }
        bufferedReader.close();

        return strings;
    }

    public static List<Student> readStudentFile(String path) throws IOException {
        List<String> strings = readFile(path);
        List<Student> students = new ArrayList<>();
        String[] info;
        for (String line : strings) {
            info = line.split(",");
            Student student= new Student();
            students.add(new Student(
                    Integer.parseInt(info[0]), info[1], info[2], info[3], Double.parseDouble(info[4]),info[5]));
        }
        return students;
    }

    public static List<Teacher> readTeacherFile(String path) throws IOException {
        List<String> strings = readFile(path);
        List<Teacher> teachers = new ArrayList<>();
        String[] info;
        for (String line : strings) {
            info = line.split(",");
            teachers.add(new Teacher(Integer.parseInt(info[0]), info[1], info[2], info[3],info[4]));
        }
        return teachers;
    }
}
