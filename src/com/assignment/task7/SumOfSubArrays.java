package com.assignment.task7;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumOfSubArrays {
    @Test
    public void test_sumOfSubArray(){
        int[] arr= new int[]{1,2,3,4,5,6,7,0};
        int sum=6;

        List<List<Integer>> results = program(arr, sum); //=> {[1,5], [2,4], [6,0]}
        Assert.assertEquals(3,results.size());
        Assert.assertTrue(results.contains(Arrays.asList(1,5)));
        Assert.assertTrue(results.contains(Arrays.asList(2,4)));
        Assert.assertTrue(results.contains(Arrays.asList(6,0)));
        /*Assert.assertTrue(results.contains(Arrays.asList(1,2,3)));
        Assert.assertTrue(results.contains(Arrays.asList(2,4,0)));
        Assert.assertTrue(results.contains(Arrays.asList(1,5,0)));*/

    }

    private List<List<Integer>> program(int[] arr, int targetSum) {
        List<List<Integer>> results = new ArrayList();

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
              if(targetSum == arr[i] + arr[j]){
                  List<Integer> result = Arrays.asList(arr[i], arr[j]);
                  results.add(result);
              }
            }
        }

        return results;
    }
}
