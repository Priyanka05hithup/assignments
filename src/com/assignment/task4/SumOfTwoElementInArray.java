package com.assignment.task4;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumOfTwoElementInArray {
    @Test
    public void test_sumOfTowArray(){
        int[] arr= new int[]{1,2,3,4,5,6,7,0,4};
        int sum=6;

        List<List<Integer>> results = program(arr, sum); //=> {[1,5], [2,4], [6,0]}
        Assert.assertEquals(3,results.size());
        Assert.assertEquals(1, (int) results.get(0).get(0));
        Assert.assertEquals(5, (int) results.get(0).get(1));
        Assert.assertEquals(2, (int) results.get(1).get(0));
        Assert.assertEquals(4, (int) results.get(1).get(1));
        Assert.assertEquals(6, (int) results.get(2).get(0));
        Assert.assertEquals(0, (int) results.get(2).get(1));
    }

    private List<List<Integer>> program(int[] arr, int targetSum) {
        List<List<Integer>> results = new ArrayList();

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
              if(targetSum - arr[i] == arr[j]){
                  List<Integer> result = Arrays.asList(arr[i], arr[j]);
                  results.add(result);
              }
            }
        }

        return results;
    }
}
