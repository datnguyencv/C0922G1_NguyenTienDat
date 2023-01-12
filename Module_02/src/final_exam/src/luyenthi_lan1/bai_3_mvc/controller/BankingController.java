package luyenthi_lan1.bai_3_mvc.controller;

import luyenthi_lan1.bai_3_mvc.model.Banking;
import luyenthi_lan1.bai_3_mvc.service.ServiceBankingImpl;

import java.util.Scanner;

public class BankingController {
    public static ServiceBankingImpl serviceBanking1 = new ServiceBankingImpl();

    public static void displayManager(){
        Scanner scanner = new Scanner(System.in);
        int choise=0;
        do {
            System.out.println("-------------------------");
            System.out.println("Chào mừng bạn đến Ngân hàng\n" +
                    "1. Hiển thị danh sách\n" +
                    "2. Thêm mới\n" +
                    "3. Thoát");


            System.out.println("mời bạn nhập lựa chọn");
            try {
                choise = Integer.parseInt(scanner.nextLine());
            }catch (NumberFormatException e){
                System.err.println("Mời bạn nhập lại số");
            }

            switch (choise){
                case 1:
                    serviceBanking1.display();
                    break;
                    // "id='" + id + '\'' +
                //                ", name='" + name + '\'' +
                //                ", moneyValue='" + moneyValue + '\'' +
                //                ", dateExp='" + dateExp + '\'' +
                //                ", costIn='" + costIn + '\'' +
                case 2:
                    System.out.println("Mời bạn nhập vào thông tin ");
                    System.out.println(" Nhập vào Id");
                    String id = scanner.nextLine();
                    System.out.println(" Nhập vào name");
                    String name = scanner.nextLine();
                    System.out.println(" Nhập vào money");
                    String money = scanner.nextLine();
                    System.out.println(" Nhập vào dateExp");
                    String date = scanner.nextLine();
                    System.out.println(" Nhập vào CostIn");
                    String cost = scanner.nextLine();
                    serviceBanking1.addBanking(new Banking(id,name,money,date,cost));
                    serviceBanking1.display();

                    break;
                case 3:
                    System.out.println("GoodBye");
                    System.exit(1);
            }

        }while (true);



    }


}
