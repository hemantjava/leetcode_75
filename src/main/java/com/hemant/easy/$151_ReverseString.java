package com.hemant.easy;

/**
 * Given an input string s, reverse the order of the words.
 * A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.
 * Return a string of the words in reverse order concatenated by a single space.
 * Note that s may contain leading or trailing spaces or multiple spaces between two words. The returned string should
 * only have a single space separating the words. Do not include any extra spaces.

 * Example 1:
 * Input: s = "the sky is blue"
 * Output: "blue is sky the"
 * Example 2:
 * Input: s = "  hello world  "
 * Output: "world hello"
 */
public class $151_ReverseString {
    public static void main(String[] args) {
        System.out.println(reverseWords("the sky is blue"));//"blue is sky the"
        System.out.println(reverseWords("  hello world  "));//"world hello"
    }

    public static String reverseWords(String s) {
        // Split the input string 's' into words using whitespace as a delimiter.
        // The "\\s+" regex matches one or more whitespace characters.
        String[] split = s.split("\\s+");

        // Create a StringBuilder to efficiently build the reversed string.
        StringBuilder sb = new StringBuilder();

        // Loop through the 'split' array in reverse order to append words to 'sb'.
        for (int i = split.length - 1; i >= 0; i--) {
            sb.append(split[i]); // Append the current word.
            sb.append(" "); // Add a space after each word.
        }

        // Convert the StringBuilder to a string and remove leading/trailing whitespace
        // using the 'strip()' method.
        return sb.toString().strip();
    }

}
