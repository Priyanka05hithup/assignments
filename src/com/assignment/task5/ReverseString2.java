package com.assignment.task5;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ReverseString2 {
    public static void main(String[] args) {
        String str="Consultadd Pvt ";
        String[] words=str.split(" ");
        StringBuffer revertedWords = new StringBuffer();

        for (String word : words) {
            String reveredWord = reverse(word);
            revertedWords.append(reveredWord).append(" ");
        }

        System.out.println(revertedWords.toString().trim());
    }

    private static String reverse(String word) {
        char[] chars = word.toCharArray();
        int start = 0;
        int end = chars.length-1;
        while (start < end){
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;

            start++;
            end--;
        }
        return new String(chars);

    }


}
