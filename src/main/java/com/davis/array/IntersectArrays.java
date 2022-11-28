package com.davis.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * https://leetcode.com/problems/intersection-of-two-arrays-ii/
 */
public class IntersectArrays {

    public static int[] intersect(int[] nums1, int[] nums2) {
        if( nums1.length < nums2.length)
            return intersect(nums2, nums1);

        Map<Integer,Integer> map = new HashMap<>();

        for( int num : nums1){
            map.put(num, map.getOrDefault(num, 0)+1);
        }

        List<Integer> list = new ArrayList<>();
        for(int num : nums2){
            Integer val = map.getOrDefault(num,0);
            if(val>0 ){
                list.add(num);
                map.put(num, val-1 );
            }
        }
        int result[] = new int[list.size()];
        for(int r =0; r<list.size();r++){
            result[r] = list.get(r);
        }
        return result;
    }
    public static void main(String[] args) {

        int nums1[] = {4, 9, 5};
        int nums2[] = {9,4,9,8,4};
        intersect(nums1, nums2);
    }
}
