package thi_module2.task3.data.read_writeFile;

import thi_module2.task3.model.Banking;

//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFileBanking {
    public static List<Banking> readFile(String pathName){
        List<Banking> bankingList = new ArrayList<>();

        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        String line;
            try {
                fileReader = new FileReader(pathName);
                bufferedReader = new BufferedReader(fileReader);
                String [] lineBank;

                while ((line = bufferedReader.readLine())!=null){
                    lineBank = line.split(",");
                    bankingList.add(new Banking(Integer.parseInt(lineBank[0]),lineBank[1],lineBank[2],lineBank[3],lineBank[4],lineBank[5]));
                }

            } catch (IOException e) {
                System.err.println(e.getMessage());
            } finally {
                try {
                    fileReader.close();
                    bufferedReader.close();
                } catch (IOException e) {
                    System.out.println(e.getMessage());;
                }

            }return bankingList;
    }







//    public static List<Banking> readFile (String pathName) {
//        List<Banking> bankingList = new ArrayList<>();
//        FileReader fileReader = null;
//        BufferedReader bufferedReader = null;
//        String line;
//
//        try {
//            fileReader = new FileReader(pathName);
//            bufferedReader = new BufferedReader(fileReader);
//
//            while ((line = bufferedReader.readLine()) != null) {
//                String[] lineList = line.split(",");
//                bankingList.add(new Banking(Integer.parseInt(lineList[0]), lineList[1], lineList[2], lineList[3], lineList[4], lineList[5]));
//            }
//
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        } finally {
//            try {
//                fileReader.close();
//                bufferedReader.close();
//            } catch (IOException e) {
//                System.err.println(e.getMessage());
//            }
//        }
//        return bankingList;
//    }
}

