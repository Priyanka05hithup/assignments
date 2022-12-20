package com.assignment.task6;

import java.util.Scanner;

public class AreaAndPerimeterOfTriangle {
    public static void main(String[] args) {
        double a,b,c,perimeter,s,area;
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter Side of a Trinagle");
        a=scn.nextDouble();
        b=scn.nextDouble();
        c=scn.nextDouble();
        perimeter=(a+b+c)/2;
        s=perimeter/2;
        area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Perimerer of the triangle:"+perimeter);
        System.out.println("Semi perimeter of a Tringle:"+s);
        System.out.println("Area of a triangle:"+area);

    }
}
