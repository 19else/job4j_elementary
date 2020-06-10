package ru.job4j.condition;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class MultiMaxTest {

    @Test
    public void whenMaxFirst() {
        int result = MultiMax.max(5, 4, 3);
        assertThat(result, is(5));
    }

    @Test
    public void whenMaxSecond() {
        int result = MultiMax.max(4, 5, 3);
        assertThat(result, is(5));
    }

    @Test
    public void whenMaxThird() {
        int result = MultiMax.max(3, 4, 5);
        assertThat(result, is(5));
    }

    @Test
    public void whenMaxAll() {
        int result = MultiMax.max(5, 5, 5);
        assertThat(result, is(5));
    }
}