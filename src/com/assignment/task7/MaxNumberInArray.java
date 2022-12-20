package com.assignment.task7;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class MaxNumberInArray {
    @Test
    public void test_LargestNumber(){
        int a[]={1,6,8,5,14,28,19};
        Assert.assertEquals(28 , findLargest(a, 1));

    }

    private int findLargest(int[] a, int position) { //O(n2) 3n -> O(n)
        for (int i = a.length-1; i > position ; i--) {
            for (int j = a.length-1; j > 0; j--) {
                if(a[j]>a[j-1]){
                    int temp = a[j];
                    a[j] = a[j-1];
                    a[j-1] = temp;
                }
            }
        }
        return a[position-1];
    }
}
