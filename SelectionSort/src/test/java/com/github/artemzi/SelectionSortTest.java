package com.github.artemzi;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class SelectionSortTest {
    private SelectionSort instance;

    @Before
    public void setUp() {
        this.instance = new SelectionSort();
    }

    @Test
    public void sortTest() {
        int[] expected = {2, 3, 11, 12, 34, 41, 43, 45};
        int[] input = {2, 34, 11, 43, 12, 41, 3, 45};
        int[] actual = instance.sort(input);
        Assert.assertTrue(Arrays.equals(expected, actual));
    }

    @Test
    public void sortWithRandomArrayTest() {
        int[] input = random(1000);
        int[] actual = instance.sort(input);
        Arrays.sort(input);
        Assert.assertTrue(Arrays.equals(input, actual));
    }

    private int[] random(int count){
        List<Integer> result = new ArrayList<>();
        Random rnd = new Random();
        for(int i = 0; i < count; i++){
            if(Math.random() > 0.5){
                result.add(rnd.nextInt());
            }
        }
        return result.stream().mapToInt(i->i).toArray();
    }
}
