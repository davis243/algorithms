package com.davis.string;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/first-unique-character-in-a-string/
 */
public class FirstNonRepeatCharacter {
    public static int firstUniqChar(String s) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        for( int i = 0; i < s.length(); i++){
            char c =  s.charAt(i);
            map.put( c, map.getOrDefault(c, 0) +1 );
        }

        for( int i = 0; i < s.length(); i++){
            if( map.get(s.charAt(i)) == 1){
                return i;
            }
        }

        return -1;

    }

    public static void main(String[] args) {
        System.out.println(firstUniqChar("leetcode"));
    }
}
