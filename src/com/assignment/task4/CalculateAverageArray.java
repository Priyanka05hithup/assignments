package com.assignment.task4;

import java.util.Arrays;

public class CalculateAverageArray {
    public static void main(String[] args) {
        double[] d={1,2,4,5}; //{4,9,4.8,6.7,9.4,9,-9.8,5,4};
        double sum=0.0;

        double asDouble = Arrays.stream(d).average().getAsDouble();
        System.out.println(asDouble);
    }
}
