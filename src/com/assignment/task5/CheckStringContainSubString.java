package com.assignment.task5;

import org.junit.Assert;
import org.junit.Test;

public class CheckStringContainSubString {

    @Test
    public void test_ifContainsSubString(){
        Assert.assertTrue(doesContainSubString("ahf"));
        Assert.assertFalse(doesContainSubString("d"));
    }

    private boolean doesContainSubString(String str) {
        return str.length()>1;
    }

    @Test
    public void test_containsSubString_whenExists(){

        Assert.assertTrue(containsSubString("art", "heartly"));

        Assert.assertFalse(containsSubString("art", "apple"));
    }

    private boolean containsSubString(String subString, String mainString) {
        return mainString.contains(subString);
    }
}
