package dsa.course.array2;

import java.util.Arrays;

public class BuySellStock {
    public static void main(String[] args) {
        BuySellStock buySellStock=new BuySellStock();
//        System.out.println("Maximum profit is: " + buySellStock.printMaxProfit(new int[]{7,1,5,3,6,4}));
//        System.out.println("Maximum profit is: " + buySellStock.maxProfitII(new int[]{7,1,5,3,6,4}));
        System.out.println("Maximum profit is: " + buySellStock.maxProfitIII(1, new int[]{7,1,5,3,6,4}));

    }

    public int printMaxProfit(int[] a) {
        int max=Integer.MIN_VALUE;
        int maxProfit=0;
        for(int i=a.length-1; i>=0;i--){
            max=Math.max(max, a[i]);
            maxProfit= Math.max(maxProfit, max-a[i]);
        }
        return maxProfit;
    }

    public int maxProfitII(int[] a) {
        int profit=0;
        for(int i=1; i<a.length;i++){
            if(a[i]-a[i-1]>0){
                profit+=a[i]-a[i-1];
            }

        }
        return profit;
    }

    public int maxProfitIII(int k, int[] prices) {
        int n = prices.length;
        if (n <= 1)
            return 0;

        //if k >= n/2, then you can make maximum number of transactions.
        if (k >=  n/2) {
            int maxPro = 0;
            for (int i = 1; i < n; i++) {
                if (prices[i] > prices[i-1])
                    maxPro += prices[i] - prices[i-1];
            }
            return maxPro;
        }

        int[][] dp = new int[k+1][n];
        for (int i = 1; i <= k; i++) {
            int localMax = dp[i-1][0] - prices[0];
            for (int j = 1; j < n; j++) {
                dp[i][j] = Math.max(dp[i][j-1],  prices[j] + localMax);
                localMax = Math.max(localMax, dp[i-1][j] - prices[j]);
            }
        }

        System.out.println("finding row: " + k +". and column: " + (n-1));
        Arrays.stream(dp).forEach(ints -> System.out.println(Arrays.toString(ints)));
//        System.out.println(Arrays.toString(dp));
        return dp[k][n-1];
    }
}
