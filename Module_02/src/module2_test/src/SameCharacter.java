

public class SameCharacter {

    public static void solve(String s1, String s2) {
        int countsame = 0,k,i=0;
        for (i=0;i < s1.length()-1;i++);{
            if (s2.indexOf(s1.charAt(i))!=-1)
                countsame+=1;
        }
        System.out.println(countsame);
        System.out.println(s2.compareTo(s1));
    }

    public static void main(String[] args)
    {
        String s1 = "abc", s2 = "abc";
        solve(s1, s2);
    }
}

