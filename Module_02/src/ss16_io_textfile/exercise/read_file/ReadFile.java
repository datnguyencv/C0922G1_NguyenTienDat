package ss16_io_textfile.exercise.read_file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {public static void main(String[] args) {
    List<String> list = readFile("src/ss16_io_textfile/exercise/read_file/countries.csv");
    for (String s : list) {
        System.out.println(s);
    }
}

    public static List<String> readFile(String pathName) {
        List<String> list = new ArrayList<>();
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        String line = "";

        try {
            fileReader = new FileReader(pathName);
            bufferedReader = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine()) != null) {
                list.add(line);
            }
        } catch (IOException e) {
            e.getStackTrace();
        } finally {
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
            } catch (IOException e) {
                e.getStackTrace();
            }
        }
        return list;
    }
}


