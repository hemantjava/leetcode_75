package com.hemant.easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Example 1:
 * Input: arr = [1,2,2,1,1,3]
 * Output: true
 * Explanation: The value 1 has 3 occurrences, 2 has 2 and 3 has 1. No two values have the same number of occurrences.
 * Example 2:
 * Input: arr = [1,2]
 * Output: false
 * Example 3:
 *
 * Input: arr = [-3,0,1,-3,1,1,1,-3,10,0]
 * Output: true
 */
public class UniqueNumOccurrences_$1207 {
    public static void main(String[] args) {
        System.out.println(uniqueOccurrences(new int[]{1,2,2,1,1,3}));//true
        System.out.println(uniqueOccurrences(new int[]{1,2}));//false
        System.out.println(uniqueOccurrences(new int[]{-3,0,1,-3,1,1,1,-3,10,0}));//true
    }
    public static boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> mapf = new HashMap<>();
        for(int x: arr){
            mapf.put(x,mapf.getOrDefault(x,0)+1);
        }
        Set<Integer> set = new HashSet<>();

        for (Integer num:mapf.values()){
            if(set.contains(num))
                return false;
            else
                set.add(num);
        }
       return true;
    }
}
