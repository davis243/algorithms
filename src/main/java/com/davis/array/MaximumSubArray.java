package com.davis.array;
/*
https://leetcode.com/problems/maximum-subarray/
 */
public class MaximumSubArray {
    public int maxArray(int nums[]){
        int sum=0;
        int maxSum=Integer.MIN_VALUE;
        int start=0;
        int end=start;

        while(start<=end && end<nums.length){
            sum += nums[end];
            end++;
            maxSum= Math.max(maxSum,sum);
            if(sum<=0) {
                //start++;
                sum=0;
            }
        }


        return maxSum;
    }

    public int sumArray(int arr[]){
        int sum = 0;
        for(int val : arr){
            sum += val;
        }
        return sum;
    }
    public static void main(String[] args) {
        int a[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(new MaximumSubArray().maxArray(a));
    }
}
