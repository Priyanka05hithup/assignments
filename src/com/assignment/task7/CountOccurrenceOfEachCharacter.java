package com.assignment.task7;

import org.junit.Assert;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountOccurrenceOfEachCharacter {
    public static void main(String[] args) {
        String str = "banana";

        char[] characters = str.toCharArray();
        Map<Character, Integer> occurenceMap = new HashMap<>();
        for (int i = 0; i < characters.length; i++) {
            if(occurenceMap.containsKey(characters[i])){
                occurenceMap.put(characters[i], occurenceMap.get(characters[i])+1);
            }else {
                occurenceMap.put(characters[i], 1);
            }
        }

        for (Map.Entry<Character, Integer> entry: occurenceMap.entrySet()) {
            System.out.println("Occurrence of "+entry.getKey()+ " is: "+ entry.getValue());
         }

        Assert.assertEquals(3, (int)occurenceMap.get('a'));
        Assert.assertEquals(1, (int)occurenceMap.get('b'));
        Assert.assertEquals(2, (int)occurenceMap.get('n'));
    }
}
