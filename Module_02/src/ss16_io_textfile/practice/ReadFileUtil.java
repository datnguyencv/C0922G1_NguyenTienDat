package ss16_io_textfile.practice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFileUtil {
    public static List<String> readFile(String path) {
    List<String> stringList = new ArrayList<>();
    String line = "";
    File file = new File(path);
    BufferedReader bufferedReader = null;
    try {
        FileReader fileReader = new FileReader(file);
        bufferedReader = new BufferedReader(fileReader);

        while ((line = bufferedReader.readLine()) != null) {
            if ("".equals(line)) {
                continue;
            }
            stringList.add(line);
        }
    } catch (IOException e) {
        e.printStackTrace();
    } finally {
        try {
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    return stringList;

}

}

