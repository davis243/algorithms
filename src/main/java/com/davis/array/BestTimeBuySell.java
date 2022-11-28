package com.davis.array;

public class BestTimeBuySell {
    public static int maxProfit(int[] prices) {
        int profit = 0 ;
        int buy = Integer.MAX_VALUE;
        int buyDay = -1;

        int sell = -1;
        int sellDay = Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            if(buy>prices[i] && sellDay >= i ){
                buy = prices[i];

                buyDay = i;
            }
            if(i+1 < prices.length && sell<prices[i+1]  ){
                sell = prices[i+1];
                sellDay = i+1;
            }

        }
        if(sell - buy > 0&& sellDay> buyDay ){
            return sell - buy;
        }
        else{
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{2,1,2,1,0,1,2}));
    }
}
