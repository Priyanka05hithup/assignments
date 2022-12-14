package com.assignment.assignment.task2;
import java.util.Scanner;

public class CheckPercentageOfStudent {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter percentage marks");
        double percentage = scan.nextDouble();

        if(percentage >= 90) {
            System.out.println("Gread: A");
        }
        else if (percentage>=75 && percentage<90){
            System.out.println("Gread: B");
        }
        else if(percentage >=65 && percentage<75){
            System.out.println("Gread:  C");
        }



    }
}
