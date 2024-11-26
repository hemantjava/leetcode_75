package com.hemant.easy;

/**
 * Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
 * You must implement a solution with a linear runtime complexity and use only constant extra space.
 * <p>
 * The XOR operation. The key property of XOR is:
 * a^a=0 (any number XORed with itself is 0).
 * a^0=a (any number XORed with 0 remains the same)
 * <p>
 * Decimal	Binary
 * 1	        0001
 * 2	        0010
 * 3	        0011
 * 4	        0100
 * 5	        0101
 * 6	        0110
 * 7	        0111
 * 8	        1000
 * 9	        1001
 * 10	        1010
 * <p>
 * 0100 ^ 0001 =>0101 ->5
 * 0101 ^ 0010 => 0111 ->7
 * 0111 ^ 0001  => 0110->6
 * 0110 ^ 0010  => 0100 ->4
 */
public class SingleNumber_$136 {

    public static void main(String[] args) {
        int[] nums1 = {2, 2, 1};
        int[] nums2 = {4, 1, 2, 1, 2};
        int[] nums3 = {1};

        System.out.println(singleNumber(nums1)); // Output: 1
        System.out.println(singleNumber(nums2)); // Output: 4
        System.out.println(singleNumber(nums3)); // Output: 1
    }

    public static int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;// XOR each number
        }
        return result; // The single number
    }
}
