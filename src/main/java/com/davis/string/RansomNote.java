package com.davis.string;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/ransom-note/
 */
public class RansomNote {
    public static boolean canConstruct(String ransomNote, String magazine) {

      /*  for(int i=0; i < ransomNote.length();i++){
            int num = magazine.indexOf(ransomNote.charAt(i));
            if(num != -1)
                magazine = magazine.substring(0, num) + magazine.substring(num+1, magazine.length());
            else{
                return false;
            }
        }

        return true;*/
      /*  Map<Character,Integer> map = new HashMap<>();
        for(int i=0; i < magazine.length();i++){
            char c = magazine.charAt(i);
            map.put(c, map.getOrDefault(c, 0)+1);
        }

        for(int i=0; i < ransomNote.length();i++){
            char c = ransomNote.charAt(i);
            int freq = map.getOrDefault(c,0);
            if (freq-1  < 0)
                return false;
            else
                map.put(c, freq-1);
        }

        return true;*/

        int[] count = new int[128];

        for (final char c : magazine.toCharArray())
            ++count[c];

        for (final char c : ransomNote.toCharArray())
            if (--count[c] < 0)
                return false;

        return true;


    }
    public static void main(String[] args) {
        System.out.println(canConstruct("aab", "baa"));
    }
}
