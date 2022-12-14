package com.assignment.task3;

public class LeftTriangleStarPattern {
    public static void main(String[] args) {
        int n=5;
        int i;
        int j;
        for ( i=1; i <= n; i++){

            for(j=1; j <= n; j++){
                if(n-(i+j) < 0){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
