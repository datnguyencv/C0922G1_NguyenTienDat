import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class SameCharacter {

    public static void solve(String s1, String s2) {
        int countsame = 0;
        StringBuilder resurt = new StringBuilder();
        int size = Math.min(s1.length(), s2.length());
        for (int i = 0; i < s1.length(); i++) {
            for (int j = 0; j < s2.length(); j++) {
                if (s1.charAt(i)==s2.charAt(j)) {
                    resurt.append(s1.charAt(i));
                    countsame++;
                    s2=s2.substring(0,j)+s2.substring(j+1);
                    break;
                }
            }
        } System.out.println(s2.toString() +" - "+ countsame);
    }






    public static void main(String[] args)
    {
        String s1 = "abcbccaa", s2 = "abca";
        solve(s1,s2);
    }
}

