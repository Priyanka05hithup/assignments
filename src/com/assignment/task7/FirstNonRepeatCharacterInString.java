package com.assignment.task7;

public class FirstNonRepeatCharacterInString {
    public static void main(String[] args) {
        String s = "aaagcdffrcrg";
        for (int i = 1; i < s.length(); i++) {
            if (s.indexOf(s.charAt(i), s.indexOf(s.charAt(i)) + 1) == -1) {
                System.out.println("First non-repeating character is "+ s.charAt(i));
                break;
            }
        }
    }
}
