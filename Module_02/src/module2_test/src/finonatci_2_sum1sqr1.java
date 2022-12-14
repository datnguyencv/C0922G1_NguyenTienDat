import java.math.BigInteger;
import java.util.Scanner;

public class finonatci_2_sum1sqr1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BigInteger t1 = new BigInteger(Integer.toString(input.nextInt()));
        BigInteger t2 = new BigInteger(Integer.toString(input.nextInt()));
        BigInteger output = new BigInteger("0");

        int n = input.nextInt();

        if(n == 1){System.out.println(t1);}
        if(n == 1){System.out.println(t2);}

        for(int i = 2; i < n; i++)
        {
            output = t2.multiply(t2);
            output = output.add(t1);

            t1 = new BigInteger(t2.toString());

            t2 = new BigInteger(output.toString());

        }
        System.out.print(output);
    }
}