package student_manager.io_library;

import student_manager.model.Student;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteFileStudent {
    private static final String PATH_FILE = "src/student_manager/datas/list_student.csv";
    public static void writeFileStudent(List<Student> students) throws IOException {
        File file = new File(PATH_FILE);

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));

        for (Student student:students) {
            bufferedWriter.write(student.formatStudentForCSV());
            bufferedWriter.newLine();
        }

        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
