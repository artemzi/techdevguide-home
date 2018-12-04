package com.github.artemzi;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SubstringTest {
    private Substring instance;

    @Before
    public void setUp() {
        this.instance = new Substring();
    }

    @Test
    public void substringIndexFoundedTest() {
        char[] needle = "foo".toCharArray();
        char[] haystack = "afoobar".toCharArray();
        int expected = 1;
        int actual = instance.substrIndex(needle, haystack);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void substringIndexNotFoundedTest() {
        char[] needle = "foo".toCharArray();
        char[] haystack = "afoobar".toCharArray();
        int expected = -1;
        int actual = instance.substrIndex(needle, haystack);
        Assert.assertNotEquals(expected, actual);
    }
}
