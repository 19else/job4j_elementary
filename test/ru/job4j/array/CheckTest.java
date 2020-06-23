package ru.job4j.array;

import  org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class CheckTest {

    @Test
    public void whenDataMonoByThrueThenTrue() {
        boolean[] input = new boolean[] {true, true, true};
        boolean result = Check.mono(input);
        assertThat(result, is(true));
    }

    @Test
    public void whenDataNotMonoByThrueThenFalse() {
        boolean[] input = new boolean[] {true, false, true};
        boolean result = Check.mono(input);

        assertThat(result, is(false));
    }

    @Test
    public void whenDataFalseIsLast() {
        boolean[] input = new boolean[] {true, true, false};
        boolean result = Check.mono(input);

        assertThat(result, is(false));
    }

}