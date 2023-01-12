package luyenthi_lan2.data.Read_Write_File;

import luyenthi_lan2.model.Teacher;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteFile {
    public static void writeFileTeach(String pathName, List<Teacher> teacherList){
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;

        try {
            fileWriter = new FileWriter(pathName);
            bufferedWriter = new BufferedWriter(fileWriter);

            for (int i = 0; i < teacherList.size(); i++) {
                bufferedWriter.write(teacherList.get(i).chuyenDoiSCV());
                bufferedWriter.newLine();
                bufferedWriter.flush();
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                bufferedWriter.close();
                fileWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
