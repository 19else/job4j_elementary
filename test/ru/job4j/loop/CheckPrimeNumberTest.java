package ru.job4j.loop;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

import static org.junit.Assert.*;

public class CheckPrimeNumberTest {

    @Test
    public void whenFive() {
        boolean result = CheckPrimeNumber.check(5);
        assertThat(result, is(true));

    }

    @Test
    public void whenFour() {
        boolean result = CheckPrimeNumber.check(4);
        assertThat(result, is(false));

    }

    @Test
    public void whenOne() {
        boolean result = CheckPrimeNumber.check(1);
        assertThat(result, is(true));

    }
}