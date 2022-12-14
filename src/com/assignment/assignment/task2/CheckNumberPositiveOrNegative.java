package com.assignment.assignment.task2;

import org.junit.Assert;
import org.junit.Test;

public class CheckNumberPositiveOrNegative {

    private static final String POSITIVE_TYPE = "POSITIVE";
    private static final String NEGATIVE_TYPE = "NEGATIVE";

    @Test
    public void isNumberPositive() {
        Assert.assertEquals(POSITIVE_TYPE, checkNumberType(10));
        Assert.assertEquals(NEGATIVE_TYPE, checkNumberType(-12));
        Assert.assertEquals(POSITIVE_TYPE, checkNumberType(1003445441));
    }

    private String checkNumberType(int number) {
        if(number > 0) {
            return POSITIVE_TYPE;
        }else {
            return NEGATIVE_TYPE;
        }
    }
}
