package com.assignment.task3;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=scn.nextInt();
        int org_num=num;
        int rev=0;
        while(num!=0){
            //num=num%10;  //getting remainder
            rev=(rev*10)+num%10;
            num=num/10;

        }
        if(org_num==rev) {
            System.out.println("palindrome number ");
        }
        else {
            System.out.println("not palindrome");
        }
    }
}
