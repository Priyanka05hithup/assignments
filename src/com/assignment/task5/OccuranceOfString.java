package com.assignment.task5;

public class OccuranceOfString {
    public static void main(String[] args) {
        String str1="PriyankaPatel";
        char search='a';
        int count=0;
        for (int i=0;i<str1.length();i++){
            if (str1.charAt(i)==search) {

                count++;
            }
        }
        System.out.println("The Character "+search+" appears "+count+" times.");
    }
}
