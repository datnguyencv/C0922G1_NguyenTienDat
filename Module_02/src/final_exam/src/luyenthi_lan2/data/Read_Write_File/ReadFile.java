package luyenthi_lan2.data.Read_Write_File;



import luyenthi_lan2.model.Teacher;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class ReadFile {
    public static List<Teacher> readFile(String pathName){
        List<Teacher> teacherList = new ArrayList<>();
        FileReader fileReader = null ;
        BufferedReader bufferedReader = null;
        String line;

        try {
            fileReader = new FileReader(pathName);
            bufferedReader = new BufferedReader(fileReader);

            while ((line = bufferedReader.readLine())!= null){
                String [] lineTeach = line.split(",");
                    teacherList.add(new Teacher(lineTeach[0],lineTeach[1],lineTeach[2],lineTeach[3],lineTeach[4],lineTeach[5]));
                }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                bufferedReader.close();
                fileReader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } return teacherList;
    }
}
