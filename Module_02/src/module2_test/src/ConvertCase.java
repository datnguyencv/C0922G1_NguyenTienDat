import java.util.*;
import java.util.regex.Matcher;

public class ConvertCase {
//    public static String titleCase(String realName) {
//        String space = " ";
//        String[] names = realName.split(space);
//        StringBuilder b = new StringBuilder();
//        for (String name : names) {
//            if (name == null || name.isEmpty()) {
//                b.append(space);
//                continue;
//            }
//            b.append(name.substring(0, 1).toUpperCase())
//                    .append(name.substring(1).toLowerCase())
//                    .append(space);
//        }
//        return b.toString();
//    }
//
//    public static void main(String[] args) {
//
////        String name = "CodegymDaNang";
////        StringBuilder sb = new StringBuilder(64);
////
////        for (int i = 0; i < name.length(); i++) {
////            char temp = name.charAt(i);
////            if (Character.isUpperCase(temp)) {
////                sb.append(" ");
////                temp = Character.toLowerCase(temp);
////            }
////            sb.append(temp);
////        }
////        name = sb.toString().trim();
////        System.out.println(name);
//
//
//        List<String> nameList = new ArrayList<String>();
//        nameList.add(titleCase("john smith"));
//        nameList.add(titleCase("tom cruise"));
//        nameList.add(titleCase("johnsmith"));
//        Collections.sort(nameList);
//        for (String name : nameList) {
//            System.out.println("name=" + name);
//        }
//
//    }
//}
//
//public class Cama {

    public static void main(String[] args) {
        String input = "CodegymDaNang";
        for (int i = 0; i < input.length(); i++) {
            if (i!=0&&Character.isUpperCase(input.charAt(i))) {
                System.out.print(" " + Character.toLowerCase(input.charAt(i)));
            }else if (i==0){
                System.out.print(Character.toLowerCase(input.charAt(i)));
            }else{
                System.out.print(input.charAt(i))
                        ;
            }
        }
    }
}

