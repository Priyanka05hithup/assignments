package com.assignment.task7;

public class IntersectionOfTwoArrayInJava {
    public static void main(String[] args) {

        int[] array1 = {4, 5, 7, 9};
        int[] array2 = {5, 3, 9, 1};
        System.out.println("Intersection of two arrays is:");
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i]==array2[j]){
                    System.out.println(array2[j]);

                }
                
            }
            
        }
    }
    
}
