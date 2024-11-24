package com.hemant.easy;

/**
 * <b> 345. Reverse Vowels of a String</b>
 * Example 1:
 * Input: s = "IceCreAm"
 * Output: "AceCreIm"
 * Explanation:
 * The vowels in s are ['I', 'e', 'e', 'A']. On reversing the vowels, s becomes "AceCreIm".
 * Example 2:
 * Input: s = "leetcode"
 * Output: "leotcede"
 */
public class $_345 {
    public static void main(String[] args) {
        System.out.println(reverseVowels("IceCreAm"));// AceCreIm
        System.out.println(reverseVowels("leetCode"));//leotCede
    }

    public static String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        String vowels = "aeiouAEIOU"; // to check Vowels
        int left = 0, right = chars.length - 1;
        while (left < right) {
            // Move a left pointer if it's not a vowel
            if (vowels.indexOf(chars[left])== -1) {
                left++;
            }
            // Move a right pointer if it's not a vowel
            else if (vowels.indexOf(chars[right]) == -1) {
                right--;
            }
            // If both above conditions fail means they are vowels, swap and move pointers
            else {
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                left++;
                right--;
            }
        }
        return new String(chars);
    }
}
