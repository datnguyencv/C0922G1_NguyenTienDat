import java.util.*;

public class DemoTest {
    public static void main(String[] args) {
        String st = "abcdefvjab";
        System.out.println(solution(st));
    }

    public static List<String> solution(String arg1) {
        Set<String> arr = new HashSet<>();
        String [] array = arg1.split("");
        Collections.addAll(arr, array);
        int count = 0;
        List<String> arrChar = new ArrayList<>();
        for (String st : arr) {
            for (String s : array) {
                if (st.equals(s)) {
                    count++;
                }
            }
            if (count > 1) {
                arrChar.add(st);
            }
            count = 0;
        }
        return arrChar;
    }
}
