package com.assignment.task5;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class Isogram {

    @Test
    public void test_isogram(){
        Assert.assertFalse(isIsogramByMap("apple"));
        Assert.assertTrue(isIsogramByMap("abcf"));
    }

    private boolean isIsogramByMap(String str) {

        char[] characters = str.toCharArray();

        Map<Character, Integer> characterMap = new HashMap<>();
        for (int i = 0; i < characters.length; i++) {
            if(characterMap.containsKey(characters[i])){
                return false;
            }else {
                characterMap.put(characters[i], 1);
            }
        }

        return true;
    }
}
