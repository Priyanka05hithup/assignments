package com.assignment.task1;


public class SwapVariableUsingThirdOne {

    public static void main(String[] args) {

        int var1= 5;
        int var2 = 10;

        System.out.println("Before swapping: var1="+ var1 +",var2=" +var2);

        int third = var1;
        var1 = var2;
        var2 = third;

        System.out.println("After swapping: var1="+ var1 +",var2=" +var2);
        var1 = var1 + var2;
        var2 = var1 - var2;
        var1 = var1 - var2;
        System.out.println("After swapping:"
                + " var1 = " + var1 + ", var2 = " + var2);
    }
}
