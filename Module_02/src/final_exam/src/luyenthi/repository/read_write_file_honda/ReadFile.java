package luyenthi.repository.read_write_file_honda;

import luyenthi.model.Honda;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
    public static List<Honda> readFileHonda(String pathName){
        List<Honda> hondas = new ArrayList<>();
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        String line;

        try {
            fileReader = new FileReader(pathName);
            bufferedReader = new BufferedReader(fileReader);

            while ((line = bufferedReader.readLine()) != null){
                String [] lineList = line.split(",");
                hondas.add(new Honda(lineList[0],lineList[1],lineList[2],lineList[3],lineList[4]));
            }

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());;
        }finally {
            try {
                bufferedReader.close();
                fileReader.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());;
            }

        }

        return hondas;
    }
}
