package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

public class FindLoopTest {

    @Test
    public void whenArrayHas5Then0() {
        int value = 5;
        int[] input = new int[] {5, 2, 3, 4, 0};
        int result = FindLoop.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayHasNoThenMinus1() {
        int value = 5;
        int[] input = new int[] {8, 2, 3, 4, 0};
        int result = FindLoop.indexOf(input, value);
        int expect = -1;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayEmptyThenMinus1() {
        int value = 5;
        int[] input = new int[5];
        int result = FindLoop.indexOf(input, value);
        int expect = -1;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayDouble5Then1() {
        int value = 5;
        int[] input = new int[] {8, 5, 3, 5, 0};
        int result = FindLoop.indexOf(input, value);
        int expect = 1;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayHasLength5To0() {
        int[] input = new int[] {5, 10, 3};
        int value = 5;
        int result = FindLoop.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }

    @Test
    public void whenFind3() {
        int[] input = new int[] {5, 2, 10, 2, 4};
        int value = 2;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = 3;
        assertThat(result, is(expect));
    }

    @Test
    public void whenNoFind5() {
        int[] input = new int[] {5, 2, 10, 2, 4, 7};
        int value = 5;
        int start = 2;
        int finish = 5;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = -1;
        assertThat(result, is(expect));
    }
}