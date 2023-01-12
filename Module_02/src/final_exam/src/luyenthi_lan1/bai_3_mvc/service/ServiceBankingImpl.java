package luyenthi_lan1.bai_3_mvc.service;

import luyenthi_lan1.bai_3_mvc.data.read_write_file.ReadFileBanking;
import luyenthi_lan1.bai_3_mvc.data.read_write_file.WriteFileBaking;
import luyenthi_lan1.bai_3_mvc.model.Banking;


import java.util.List;

public class ServiceBankingImpl implements IServiceBanking {
    private static final String PATH_FILE = "src/luyenthi_lan1/bai_3_mvc/data/banking.csv";

    @Override
    public void display() {
        List<Banking> bankingList = ReadFileBanking.readFile(PATH_FILE);
        if (bankingList.isEmpty()) {
            System.out.println("List rỗng bạn cần nhập trước ");
            return;
        }
        for (int i = 0; i < bankingList.size(); i++) {
            System.out.println(bankingList.get(i));
        }

    }

    @Override
    public void addBanking(Banking banking) {
        List<Banking> bankingList = ReadFileBanking.readFile(PATH_FILE);
        bankingList.add(banking);

        WriteFileBaking.writeFileBaking(PATH_FILE,bankingList);
    }



}

