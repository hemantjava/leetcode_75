package com.hemant.easy;

import java.util.Arrays;

public class $283_MoveZero {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));//[1,3,12,0,0]
    }

    public static void moveZeroes(int[] nums) {
        int moveIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[moveIndex];
                nums[moveIndex] = temp;
                moveIndex++;
            }
        }
    }
}
