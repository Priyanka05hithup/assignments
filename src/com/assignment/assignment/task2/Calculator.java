package com.assignment.assignment.task2;

import org.junit.Assert;
import org.junit.Test;

public class Calculator {

    private int calculate(String operation, int num1, int num2) {

        switch (operation){
            case "ADD" : return num1 + num2;
            case "SUB" : return  num1 - num2;
            case "MUL" : return num1*num2;
            case "DIV" : return num1/num2;
            default: throw new IllegalArgumentException("operation not found");
        }

    }

    @Test
    public void testAddition(){
        Assert.assertEquals(24, calculate("ADD",18,6));
    }

    @Test
    public void testAddition2(){
        Assert.assertEquals(55, calculate("ADD",30,25));
    }

    @Test
    public void testSubtraction(){
        Assert.assertEquals(12, calculate("SUB",18,6));
    }


    @Test
    public void testMultiplication(){
        Assert.assertEquals(24, calculate("MUL", 6,4));
    }

    @Test
    public void testDivision(){
        Assert.assertEquals(6, calculate("DIV", 18,3));
    }

}
