package com.davis.array;

/**
 * https://leetcode.com/problems/two-sum/
 */
public class TwoSum {
    public int [] twoSum(int nums[], int target){
        int start = 0;
        int end = start+1;
        while(start<=end && end<nums.length){
            if(nums[start] + nums[end] == target ){
                return new int[]{start, end};
            }
            end++;
            if(end == nums.length){
                start++;
                end = start+1;
            }
        }
        return  new int[]{};
    }
    public static void main(String[] args) {
        System.out.println(new TwoSum().twoSum(new int[]{1,2,3}, 3));
    }
}
