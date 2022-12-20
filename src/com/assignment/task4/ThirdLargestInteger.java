package com.assignment.task4;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class ThirdLargestInteger {
    @Test
    public void test_thirdLargest(){
        int a[]={1,6,8,5,14,28,19};
        Assert.assertEquals(14 , findLargest(a, 3));

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
        Arrays.stream(a).forEach(System.out::println);
        return a[position-1];
    }
}
