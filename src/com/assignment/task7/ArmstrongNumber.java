package com.assignment.task7;

import org.junit.Assert;
import org.junit.Test;

public class ArmstrongNumber {

    @Test
    public void test_armstrongNumber(){

        Assert.assertTrue(isArmstrongNumber(153));
        Assert.assertTrue(isArmstrongNumber(370));
        Assert.assertFalse(isArmstrongNumber(154));
    }

    private boolean isArmstrongNumber(int number) {
        int originalNumber = number;
        int sumOfCubes=0;

        while(number != 0){
            int digit = number%10;
            sumOfCubes = sumOfCubes+(int)Math.pow(digit,3);
            number = number/10;
        }

        return sumOfCubes==originalNumber;
    }
}
