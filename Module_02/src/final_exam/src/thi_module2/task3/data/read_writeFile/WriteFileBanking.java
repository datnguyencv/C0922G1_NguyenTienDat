package thi_module2.task3.data.read_writeFile;

import thi_module2.task3.model.Banking;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;


public class WriteFileBanking {
    public static void writeFile(String pathName, List<Banking> bankingList){
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
        } finally {
            try {
                bufferedWriter.close();
                fileWriter.close();
            } catch (IOException e) {
                System.err.println(e.getMessage());;
            }

        }

    }




//    public static void writeFile(String pathName, List<Banking> list){
//        FileWriter fileWriter = null;
//        BufferedWriter bufferedWriter = null;
//
//        try {
//            fileWriter = new FileWriter(pathName);
//            bufferedWriter = new BufferedWriter(fileWriter);
//
//            for (int i = 0; i < list.size(); i++) {
//                bufferedWriter.write(list.get(i).convertCSV());
//                bufferedWriter.newLine();
//                bufferedWriter.flush();
//            }
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }finally {
//            try {
//                fileWriter.close();
//                bufferedWriter.close();
//            } catch (IOException e) {
//                System.out.println(e.getMessage());
//            }
//        }
//
//    }
}
