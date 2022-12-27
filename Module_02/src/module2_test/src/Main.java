//import java.util.*;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Nhập chuỗi: ");
//        String str = scanner.nextLine();
//        solution(str);
//    }
//
//    private static void solution(String str) {
//        String[] arrayChar = str.split("");
//        int count;
//
//        Set<String> stringList1 = new TreeSet<>();
//
//        Map<String, Integer> map = new HashMap<>();
//
//        for (String s : arrayChar) {
//            if (!s.equals(" ")) {
//                stringList1.add(s);
//            }
//        }
//
//        for (String s : stringList1) {
//            count = 0;
//            for (String s1 : arrayChar) {
//                if (s.equals(s1)) {
//                    count++;
//                }
//            }
//            map.put(s,count);
//        }
//
//        for (Map.Entry<String,Integer> entry: map.entrySet()) {
//            if(entry.getValue() )
//        }
//
//
//    }
//}
