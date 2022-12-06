package case_study_furama_resort.utils.read_write_file;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteFileUtil {
    /*
     * write ra file bất kì
     */
    public static void writeFile(String src, boolean append, List<String> list) {
        FileWriter fileWriter;
        try {
            fileWriter = new FileWriter(src, append);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (String string : list) {
                bufferedWriter.write(string);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
