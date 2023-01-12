package luyenthi.controller;

import javafx.scene.chart.ScatterChart;
import luyenthi.service.HondaServiceImpl;

import java.util.Scanner;

public class HondaController {
    public static HondaServiceImpl hondaService = new HondaServiceImpl();
    public static Scanner scanner = new Scanner(System.in);

    public static void hondaManager(){
        do {
            System.out.println("===================");
            System.out.println("1. Show list\n" +
                    "2. Add List\n" +
                    "3. Exit");
            int choise=0;
            try {
                choise = Integer.parseInt(scanner.nextLine());
            } catch( NumberFormatException e){
                System.out.println(e.getMessage());
            }finally {
                System.out.println("Mời bạn nhập lựa chọn");
            }

        }while (true);

    }
}
