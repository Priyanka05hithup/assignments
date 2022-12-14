package com.assignment.assignment.task2;

import org.junit.Assert;
import org.junit.Test;

public class CheckAlphabet {


    @Test
    public void test_isCharacterAlphabet(){
        Assert.assertFalse(isCharacterAlphabet('2'));
        Assert.assertTrue(isCharacterAlphabet('f'));
        Assert.assertTrue(isCharacterAlphabet('D'));
        Assert.assertTrue(isCharacterAlphabet('S'));
        Assert.assertTrue(isCharacterAlphabet('s'));
        Assert.assertFalse(isCharacterAlphabet('-'));
        Assert.assertFalse(isCharacterAlphabet('$'));
    }

    private boolean isCharacterAlphabet(char ch) {
        return (ch >=65 && ch <= 90) || (ch >=97 && ch <= 122);
    }
}
