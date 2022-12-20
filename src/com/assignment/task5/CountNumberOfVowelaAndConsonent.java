package com.assignment.task5;

public class CountNumberOfVowelaAndConsonent {
    public static void main(String[] args) {
        String str1="priyanka";
        int vCount=0;
        int Ccount=0;
        for (int i=0;i<str1.length();i++){
            if(str1.charAt(i) == 'a' || str1.charAt(i) == 'e' || str1.charAt(i) == 'i' || str1.charAt(i) == 'o' || str1.charAt(i) == 'u') {
                vCount++;
            }
            else if (str1.charAt(i) >= 'a' && str1.charAt(i)<'z'){
                Ccount++;
            }


            }
            System.out.println("number of vowels:"+ vCount);
        System.out.println("number of consonent:"+ Ccount);
        }
        }
