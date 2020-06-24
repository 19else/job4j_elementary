package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class MinRangeTest {

    @Test
    public void whenFirstMin() {
        assertThat(MinRange.findMin(
                new int[] {-1, 0, 5, 10},
                1, 3
        ),
                is(0)
                );

    }

    @Test
    public void whenLastMin() {
        assertThat(MinRange.findMin(
                new int[] {10, 8, 6, 4},
                1, 3
        ),
                is(4)
        );
    }

    @Test
    public void whenMiddleMin() {
        assertThat(MinRange.findMin(
                new int[] {12, 10, 8, 9},
                0, 2
        ),
                is(8)
        );
    }
}