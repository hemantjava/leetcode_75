package com.hemant.easy;

public class StringCompression_$443 {
    public static void main(String[] args) {
        char[] chars = new char[]{'a', 'b', 'c'};
        System.out.println(compress(chars));
    }

    public static int compress(char[] chars) {
        int count = 0;
        StringBuilder sb = new StringBuilder();
        if (chars.length <= 1)
            return 1;
        char p = chars[0];
        for (int i = 0; i < chars.length; i++) {
            if (p == chars[i]) {
                count++;
            } else {
                if (count == 1)
                    sb.append(chars[i - 1]);
                else
                    sb.append(chars[i - 1]).append(count);
                p = chars[i];
                count = 1;
            }
        }
        if (count == 1)
            sb.append(chars[chars.length - 1]);
        else
            sb.append(chars[chars.length - 1]).append(count);
        char[] charArray = sb.toString().toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            chars[i] = charArray[i];
        }
        System.out.println(sb);
        return sb.length();
    }


}
