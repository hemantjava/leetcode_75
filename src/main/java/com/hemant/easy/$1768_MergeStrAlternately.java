package com.hemant.easy;

/**
 * Merge Strings Alternately,
 * You are given two strings word1 and word2. Merge the strings by adding letters in alternating order,
 * starting with word1. If a string is longer than the other, append the additional letters onto the end of the merged string.
 * <p>
 * Example 1:
 * Input: word1 = "abc", word2 = "pqr"
 * Output: "apbqcr"
 * <p>
 * Example 2:
 * Input: word1 = "ab", word2 = "pqrs"
 * Output: "apbqrs"
 */
public class $1768_MergeStrAlternately {
    public static void main(String[] args) {
        System.out.println(mergeAlternately("abc", "pqr"));//apbqcr
        System.out.println(mergeAlternately("ab", "pqrs"));//apbqrs
    }

    public static String mergeAlternately(String word1, String word2) {
        // StringBuilder is used for efficient string concatenation
        StringBuilder result = new StringBuilder();

        // Initialize a counter to iterate through both strings
        int i = 0;

        // Loop until all characters from both strings are processed
        while (i < word1.length() || i < word2.length()) {
            // If 'i' is within the bounds of word1, append the character at index 'i' to result
            if (i < word1.length()) {
                result.append(word1.charAt(i));
            }

            // If 'i' is within the bounds of word2, append the character at index 'i' to result
            if (i < word2.length()) {
                result.append(word2.charAt(i));
            }

            // Increment the counter to move to the next index
            i++;
        }

        // Convert the StringBuilder content to a String and return it
        return result.toString();
    }

}
