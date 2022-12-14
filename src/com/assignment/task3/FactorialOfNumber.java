package com.assignment.task3;

public class FactorialOfNumber {
    public static void main(String[] args) {
        int n1=5;
        long factorial=1;
        for(int i=1; i<=n1; i++){
           factorial=factorial*i;

        }

        System.out.println("factorial of number is:" + factorial);
    }
}
