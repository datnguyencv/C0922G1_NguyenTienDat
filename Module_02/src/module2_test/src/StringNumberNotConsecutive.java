import java.util.*;

public class StringNumberNotConsecutive {
    public static void ResurtCheck(String[] number){
        TreeSet <String> numberList = new TreeSet<>();
        Collections.addAll(numberList,number);
        int size=numberList.size();
        for (int i  = 1; i < size; i++) {
            for (String str: numberList){
                if(str.equals(i)){
                    System.out.println(str.toString());
                }
            }

        }





        System.out.println(numberList);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputNum = scanner.nextLine();
        String[] number = inputNum.split(" ");
        ResurtCheck(number);



    }
}
