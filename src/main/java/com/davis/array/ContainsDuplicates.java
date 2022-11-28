package com.davis.array;

import java.util.Set;
import java.util.HashSet;
/*
* https://leetcode.com/problems/contains-duplicate/
* */

public class ContainsDuplicates {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(Integer a : nums){
           if(!set.add(a)){
               return true;
           }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] a = {1, 2,1,2};
        System.out.println(new ContainsDuplicates().containsDuplicate(a));
    }
}
