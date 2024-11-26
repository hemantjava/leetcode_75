package com.hemant.medium;

import java.util.Stack;

/**
 * Given an array of integer temperatures represents the daily temperatures, return an array answer such that answer[i]
 * is the number of days you have to wait after the ith day to get a warmer temperature.
 * If there is no future day for which this is possible, keep answer[i] == 0 instead.
 */
public class DailyTemperature_$739 {
        public static int[] dailyTemperatures(int[] temperatures) {
            int n = temperatures.length;
            int[] answer = new int[n];
            Stack<Integer> stack = new Stack<>();

            for (int i = 0; i < n; i++) {
                //inside the while loop when the temperature higher and stack is not empty
                while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                    int idx = stack.pop();
                    answer[idx] = i - idx;
                }
                stack.push(i);//storing index in stack
            }

            return answer;
        }

        public static void main(String[] args) {
            int[] temperatures1 = {73, 74, 75, 71, 69, 72, 76, 73};
            int[] temperatures2 = {30, 40, 50, 60};
            int[] temperatures3 = {30, 60, 90};

            System.out.println(java.util.Arrays.toString(dailyTemperatures(temperatures1))); // Output: [1,1,4,2,1,1,0,0]
            System.out.println(java.util.Arrays.toString(dailyTemperatures(temperatures2))); // Output: [1,1,1,0]
            System.out.println(java.util.Arrays.toString(dailyTemperatures(temperatures3))); // Output: [1,1,0]
        }
}
