package com.assignment.assignment.task2;

import java.util.Scanner;

public class CalculateTheIncomTax {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter Income");
        double income=scn.nextDouble();
        double tax=0;

        if(income > 250000 && income <= 600000){
            tax = .10*income;

        }
        else if (income > 600000 && income <= 12000000){
            tax = .18*income;
        }else if (income >1200000){
            tax=.25*income;

        }else if (income<250000){
            tax=0;

        }
        System.out.println(tax);
    }
}
