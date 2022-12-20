package com.assignment.task7;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;

public class StringHasUnicCharacter {

    @Test
    public  void test_IfStringUnic(){
        Assert.assertTrue(ifStringIsUnicCharacter("priya"));
        Assert.assertFalse(ifStringIsUnicCharacter("priyanka"));
    }

    private boolean ifStringIsUnicCharacter(String s) {
        return false;
    }
    /*char[] character=s.toCharArray();

    set<character> char=new HashSet<>();*/


}
