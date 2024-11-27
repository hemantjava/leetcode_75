package com.hemant.medium;

/**
 Example 1:
 Input: s = "leet**cod*e"
 Output: "lecoe"
 Explanation: Performing the removals from left to right:
 - The closest character to the 1st star is 't' in "leet**cod*e". s becomes "lee*cod*e".
 - The closest character to the 2nd star is 'e' in "lee*cod*e". s becomes "lecod*e".
 - The closest character to the 3rd star is 'd' in "lecod*e". s becomes "lecoe".
 There are no more stars, so we return "lecoe".

 Example 2:
 Input: s = "erase*****"
 Output: ""
 Explanation: The entire string is removed, so we return an empty string.
 */
public class $2390_RemoveStarts {
    public static void main(String[] args) {
        String s = "leet**cod*e";
        System.out.println(removeStars(s));//lecoe
    }

    public static String removeStars(String s) {
        StringBuilder sb = new StringBuilder();
        char[] str = s.toCharArray();
        for (char c : str) {
            if (c == '*')
                sb.deleteCharAt(sb.length() - 1); //last character from StringBuilder
            else
                sb.append(c);//add current character
        }
        return sb.toString();
    }
}
