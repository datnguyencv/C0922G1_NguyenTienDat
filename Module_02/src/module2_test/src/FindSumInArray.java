package module2_test.src;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FindSumInArray {
    public static void checkSum(int [] arr,int k){
        Map<Integer,Integer> resurt = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length && j != i; j++) {
                if (k==arr[i]+arr[j]){
                    resurt.put(arr[i],arr[j]);
                }
            }
        }
        System.out.println("Số lần xuất hiện " +resurt.size()+" các dãy là : "+ resurt);
    }

    public static void main(String[] args) {
        int [] arr = {1,2,5,3,1,0};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số cần kiểm tra: ");
        int k = Integer.parseInt(scanner.nextLine());
        checkSum(arr,k);
    }

}



