package com.hemant.easy;

/**
 * Given an integer n, return an array ans of length n + 1 such that for each i (0 <= i <= n),
 * ans[i] is the number of 1's in the binary representation of i.


 *
 * Example 1:
 * Input: n = 2
 * Output: [0,1,1]
 * Explanation:
 * 0 --> 0
 * 1 --> 1
 * 2 --> 10
 *
 * Example 2:
 * Input: n = 5
 * Output: [0,1,1,2,1,2]
 * Explanation:
 * 0 --> 0
 * 1 --> 1
 * 2 --> 10
 * 3 --> 11
 * 4 --> 100
 * 5 --> 101
 */
public class CountingBits_$338 {
    public static int[] countBits(int n) {
        int[] ans = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            ans[i] = ans[i >> 1] + (i & 1); // Use bit-shift and bitwise AND
        }
        return ans;
    }
    public static void main(String[] args) {
        int n1 = 2;
        int n2 = 5;

        int[] result1 = countBits(n1);
        int[] result2 = countBits(n2);

        System.out.println(java.util.Arrays.toString(result1)); // Output: [0, 1, 1]
        System.out.println(java.util.Arrays.toString(result2)); // Output: [0, 1, 1, 2, 1, 2]
    }
}
