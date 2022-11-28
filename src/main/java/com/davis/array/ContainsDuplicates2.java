package com.davis.array;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.HashMap;
/*
https://leetcode.com/problems/contains-duplicate-ii/

 */
public class ContainsDuplicates2 {

    public boolean containsDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i< nums.length; i++){
                if(map.containsKey(nums[i])){
                    if(Math.abs(i-map.get(nums[i])) <= k && i != map.get(nums[i])){
                        return true;
                    }
                }
                map.put(nums[i], i);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,1,2,3};
        System.out.println(new ContainsDuplicates2().containsDuplicate(a, 2));
    }
}
