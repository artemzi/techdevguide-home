package com.github.artemzi;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LongestWordInDictionaryTest {
    String S = "abppplee";
    String[] D = new String[] {"able", "ale", "apple", "bale", "kangaroo"};
    LongestWordInDictionary instance;

    public LongestWordInDictionaryTest() {}


    @Before
    public void setUp() {
        this.instance = new LongestWordInDictionary();
    }

    @Test
    public void problemConditionsTest() {
        String result = instance.getResult(instance.solve(S, D));
        Assert.assertEquals(result, "apple");
    }
}
