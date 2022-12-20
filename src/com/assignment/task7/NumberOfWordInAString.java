package com.assignment.task7;

import java.util.Scanner;

public class NumberOfWordInAString {
    public static void main(String[] args) {
        System.out.println("Enter The String");
        Scanner scn=new Scanner(System.in);
        String s=scn.nextLine();//Welcome to java
        int count=1;
        for (int i = 1; i <s.length() ; i++) {
           if( (s.charAt(i)==' ') && (s.charAt(i+1)!=' ')){
               count++;
           }

        }
        System.out.println("number of word in a string is:"+count);

    }
}
