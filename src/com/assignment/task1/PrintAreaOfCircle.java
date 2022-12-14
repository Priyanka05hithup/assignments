package com.assignment.task1;
import java.util.Scanner;

public class PrintAreaOfCircle {
    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);
        Double radius = sn.nextDouble();

        Double area = 3.14 * radius * radius;
        System.out.println("Area = " + area);
    }
}
