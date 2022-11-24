package demo_fibo;

import java.util.Scanner;

public class Fibonacci
{
    public int CheckFibo(int n)
    {
        if (n == 0 || n == 1){
            return 1;
        }
        return CheckFibo(n-1) + CheckFibo(n-2);
    }
}

class InputCheck
{
    public static void main(String[] args)
    {
        int n;
        int Fi;
        System.out.println("Nhập vào số nguyên:");
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        Fibonacci fibonacci = new Fibonacci();
        Fi = fibonacci.CheckFibo(n);

        System.out.println("Fi(" + n + ") = " + Fi);
    }
}
