import java.util.Scanner;

public class CheckStringCompar {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        String mot1= scanner.nextLine();
        String mot2= scanner.nextLine();
        compareWords(mot1,mot2);
    }
    public static int compareWords(String mot1,String mot2){

        String toLowerCase = mot1.toLowerCase();
        String toLowerCase1 = mot2.toLowerCase();
        int answer=0
//                ,lenght=(mot1.length()<mot2.length())?mot1.length():mot2.length()
                ;
        int lenght  = Math.min(mot1.length(),mot2.length());

        for (int i = 0; i < lenght; i++) {

            if (toLowerCase.charAt(i)<toLowerCase1.charAt(i)) {
                answer=1;
                  System.out.println("loop1:"+answer);
            }else{
                if (toLowerCase.charAt(i)>toLowerCase1.charAt(i)) {
                    answer=-1;
                    break;
                }
            }
        }
        if (answer==0) {
            if (mot1.length()<mot2.length()) {
                answer=1;
                   System.out.println("if1:"+answer);
            }else {
                if (mot1.length()==mot2.length()) {
                    answer=0;
                }else answer=-1;
            }
        }
         System.out.println("answer:"+answer);
        return answer;
    }
}
