package com.example.product_be;

import java.util.Arrays;

public class Main
{
    public static void main (String[]args)
    {
        int res = solution (new int[]{ 1, 3, 5 }, 11);
        System.out.println ("Result: " + res);
    }

    static int solution (int[]coins, int amount)
    {
        int[] dp = new int[amount + 1];
        Arrays.fill (dp, amount + 1);
        dp[0] = 0;

        for (int coin:coins)
        {
            for (int j = coin; j <= amount; j++)
            {
                dp[j] = Math.min (dp[j], dp[j - coin] + 1);
                System.out.println("Coins needed for " + j + " cents: " + dp[j]);

            }
        }

        return dp[amount] <= amount ? dp[amount] : -1;
    }
}
