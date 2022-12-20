package com.assignment.task5;

import sun.font.TrueTypeFont;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String str1="HEART";
        String str2="EARTH";
        if
        (str1.length() ==str2.length()){
            //convert char array
            char[] chararray1=str1.toCharArray();
            char[] chararray2=str2.toCharArray();
            Arrays.sort(chararray1);
            Arrays.sort(chararray2);
            if(chararray1==chararray2){
                System.out.println(str1 + "and" +str2+"aragram");

            }
            else{
                System.out.println(str1 + "and" + str2+"are not aragram");
            }

        }

    }
}
