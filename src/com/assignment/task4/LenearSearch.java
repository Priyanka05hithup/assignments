package com.assignment.task4;

public class LenearSearch {
    public static void main(String[] args) {
        int a[]={10,20,30,40,50};
        int searcn_int=60;
        boolean flag=false;
        for (int i=0;i<a.length;i++) {
            if (searcn_int == a[i]) {
                System.out.println("Element found at:" + i);
                flag = true;
                break;
            }
        }
            if (flag==false) {
                System.out.println("Element not found");
            }

        }
    }

