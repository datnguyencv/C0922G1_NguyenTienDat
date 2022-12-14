import java.io.IOException;

public class SameCharacter {

    public static void solve(String s1, String s2) {
        int countsame = 0,i;
        for (i =0;i < s1.length()-1;i++);{
            if (s2.indexOf(s1.charAt(i))>0)
                countsame+=1;
        }
        System.out.println(countsame);
    }

    public static void main(String[] args)
    {
        String s1 = "aabcc", s2 = "adaa";
        solve(s1, s2);
    }
}

