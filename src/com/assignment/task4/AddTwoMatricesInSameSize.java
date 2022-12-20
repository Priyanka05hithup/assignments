package com.assignment.task4;

import org.junit.Assert;
import org.junit.Test;

public class AddTwoMatricesInSameSize {

    @Test
    public void test_metricsEquality(){
        int a[][]={{10,30,40,50},
                {20,30,40,54},
                {10,50,70,55},
        };

        int b[][]={
                {10,30,40,50},
                {20,30,40,54},
                {10,50,70,55},
        };

        int c[][]={
                {20,30,40,50},
                {20,30,40,54},
                {10,40,70,55},
        };

        Assert.assertTrue(areMetricsSame(a, b));
        Assert.assertFalse(areMetricsSame(a, c));

    }

    private boolean areMetricsSame(int[][] a, int[][] b) {

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if(a[i][j] != b[i][j]){
                    return false;
                }
            }
        }

        return true;
    }

}
