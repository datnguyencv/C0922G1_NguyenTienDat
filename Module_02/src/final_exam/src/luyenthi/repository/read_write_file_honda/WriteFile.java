package luyenthi.repository.read_write_file_honda;

import luyenthi.model.Honda;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteFile {
    public static void writeFileHonda(String pathName, List<Honda> hondas){
        FileWriter fileWriter =null;
        BufferedWriter bufferedWriter = null;

        try {
            fileWriter = new FileWriter(pathName);
            bufferedWriter = new BufferedWriter(fileWriter);

            for (int i = 0; i < hondas.size(); i++) {
                bufferedWriter.write(hondas.get(i).convertToCSVHonda());
                bufferedWriter.flush();
                bufferedWriter.close();
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }finally {
            try {
                bufferedWriter.close();
                fileWriter.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }

        }

    }
}
