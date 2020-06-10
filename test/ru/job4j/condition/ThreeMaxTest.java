package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import static org.junit.Assert.*;

public class ThreeMaxTest {

    @Test
    public void maxFirst() {
        int result = ThreeMax.max(10, 5, 1);
        assertThat(result, is(10));
    }

    @Test
    public void maxSecond() {
        int result = ThreeMax.max(10, 50, 1);
        assertThat(result, is(50));
    }

    @Test
    public void maxThird() {
        int result = ThreeMax.max(1, 5, 50);
        assertThat(result, is(50));
        }

        @Test
    public void maxEq() {
        int result = ThreeMax.max(1, 1, 1);
        assertThat(result, is(1));
        }

        @Test
    public void firstEqSecond() {
        int result = ThreeMax.max(10, 10, 5);
        assertThat(result, is(10));
        }

        @Test
    public void firstEqThird() {
        int result = ThreeMax.max(100, 1, 100);
        assertThat(result, is(100));
        }

        @Test
    public void secondEqThird() {
        int result = ThreeMax.max(1, 100, 100);
        assertThat(result, is(100));
        }
}