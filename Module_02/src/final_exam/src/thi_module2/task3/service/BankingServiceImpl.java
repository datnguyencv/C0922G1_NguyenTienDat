package thi_module2.task3.service;

import luyenthi_lan2.data.Read_Write_File.ReadFile;
import luyenthi_lan2.model.Teacher;
import thi_module2.task3.data.read_writeFile.ReadFileBanking;
import thi_module2.task3.data.read_writeFile.WriteFileBanking;
import thi_module2.task3.model.Banking;

import java.util.Collections;
import java.util.List;

// tính da hinh
public class BankingServiceImpl implements IBankingService {
    public static final String PATH_NAME = "src/thi_module2/task3/data/banking.csv";
    public static ValidateIdBookMoney validateIdBookMoney = new ValidateIdBookMoney();

    public static void check(String str) {

    }

    @Override
    public void add(Banking banking) {
        List<Banking> bankingList = ReadFileBanking.readFile(PATH_NAME);
        bankingList.add(banking);


        WriteFileBanking.writeFile(PATH_NAME, bankingList);
        System.out.println("Done");


    }

    @Override
    public void displayList() {
        List<Banking> bankingList = ReadFileBanking.readFile(PATH_NAME);
        for (int i = 0; i < bankingList.size(); i++) {
            System.out.println(bankingList.get(i));
        }

    }

    @Override
    public void sort() {
        List<Teacher> teacherList = ReadFile.readFile(PATH_NAME);

    }

    @Override
    public void find(String str) {
        List<Banking> bankingList = ReadFileBanking.readFile(PATH_NAME);
        for (Banking banking : bankingList) {
            if (banking.getNameCustormer().contains(str)) {
                System.out.println(banking);
            }
        }
    }

}
