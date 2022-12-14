package com.assignment.task1;

import org.junit.Assert;
import org.junit.Test;

public class AddTwoNumber
{

    private int addition(int n1, int n2){
        return n1+n2;
    }

    @Test
    public void testAddition(){
        Assert.assertEquals(11, addition(5, 6));
        Assert.assertEquals(4300, addition(4000, 300));
    }
}
