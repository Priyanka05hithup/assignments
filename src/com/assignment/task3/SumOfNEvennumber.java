package com.assignment.task3;

import java.util.Scanner;

public class SumOfNEvennumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the valu of n:");
        int num = scn.nextInt();
        int sum = 0;
        int count = 0;
        while (count <= num) {
            if (count % 2 == 0) {
                sum += count;
            }
            count++;
        }
        System.out.println("Sum: " + sum);
    }
}


