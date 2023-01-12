package thi_module2.task3.controller;

import thi_module2.task3.data.read_writeFile.ReadFileBanking;
import thi_module2.task3.model.Banking;
import thi_module2.task3.service.BankingServiceImpl;

import java.util.List;
import java.util.Scanner;

import static thi_module2.task3.service.BankingServiceImpl.PATH_NAME;

public class BankingController {
    private static final Scanner scanner = new Scanner(System.in);
    private static final BankingServiceImpl bankingService = new BankingServiceImpl();


    public static void displayManager(){
        do {
            System.out.println("-----");
            System.out.println("1. Display Banking Information ");
            System.out.println("2. Add custormer");
            System.out.println("3. sort custormer");
            int choise=0;
            try {
                choise = Integer.parseInt(scanner.nextLine());
            }catch (NumberFormatException e){
                System.err.println("Input Only Number");
            }

            switch (choise){
                case 1:
                    System.out.println("");
                    bankingService.displayList();
                    break;
                case 2:

                    System.out.println("Please enter worker information: ");
                    List<Banking> bankingList = ReadFileBanking.readFile(PATH_NAME);
                    int ids = 0;
                    for (Banking bk:bankingList){
                        ids= bk.getIdCustomer()+1;
                    }
                    System.out.println("ID customer :"+ids);
                    System.out.println("Enter ID BankingBooK:");
                    String idbankBook = scanner.nextLine();
                    System.out.println("Enter name:");
                    String name = scanner.nextLine();
                    System.out.println("Enter money:");
                    String money = scanner.nextLine();
                    System.out.println("Enter expDate:");
                    String expDate = scanner.nextLine();
                    System.out.println("Enter costMoney:");
                    String costMoney = scanner.nextLine();
                    Banking banking = new Banking(ids, idbankBook,name, money, expDate,costMoney);
                    bankingService.add(banking);
                    break;
                case 3:
                    System.out.println("nhập cần tìm");
                    String find= scanner.nextLine();
                    bankingService.find(find);
                    break;

            }
        } while (true);


    }
}
