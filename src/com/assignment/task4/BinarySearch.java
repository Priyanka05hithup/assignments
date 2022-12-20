package com.assignment.task4;

import org.junit.Assert;
import org.junit.Test;

public class BinarySearch {

    @Test
    public void test_search(){
        int[] arr = new int[]{1,2,3,4,6,7,10};

        Assert.assertEquals(5, find(arr, 7, 0, 6));
        Assert.assertEquals(1, find(arr, 2, 0, 6));
        Assert.assertEquals(0, find(arr, 1, 0, 6));
        Assert.assertEquals(6, find(arr, 10, 0, 6));
        try{
            Assert.assertEquals(6, find(arr, 9, 0, 6));
            Assert.fail();
        }catch (IllegalArgumentException ex){
        }

    }

    private int find(int[] arr, int i,int start, int end) {
        int middle = (end + start) / 2;

        if(i == arr[middle]){
            return middle;
        }else if(i > arr[middle]){
            return find(arr, i, middle+1, end);
        } else if(i <arr[middle]){
            return find(arr, i, start, middle-1);
        }

        throw new IllegalArgumentException("Not found");
    }


}
