package luyenthi_lan1.bai_3_mvc.data.read_write_file;


import luyenthi_lan1.bai_3_mvc.model.Banking;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFileBanking {
    public static List<Banking> readFile(String pathName) {
        List<Banking> bankingList = new ArrayList<>();
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        String line;

        try {
            fileReader = new FileReader(pathName);
            bufferedReader = new BufferedReader(fileReader);

            while ((line = bufferedReader.readLine()) != null) {
                String[] lineBank = line.split(",");
                bankingList.add(new Banking((lineBank[0]), lineBank[1], lineBank[2], lineBank[3], lineBank[4]));
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                fileReader.close();
                bufferedReader.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }

        }

        return bankingList;
    }
}
