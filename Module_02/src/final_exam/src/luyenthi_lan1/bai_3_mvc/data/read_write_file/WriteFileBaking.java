package luyenthi_lan1.bai_3_mvc.data.read_write_file;

import luyenthi_lan1.bai_3_mvc.model.Banking;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteFileBaking {
    public static void writeFileBaking(String pathName, List<Banking> bankingList){
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;

        try {
            fileWriter = new FileWriter(pathName);
            bufferedWriter = new BufferedWriter(fileWriter);

            for (int i = 0; i < bankingList.size(); i++) {
                bufferedWriter.write(bankingList.get(i).convertCSV());
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
