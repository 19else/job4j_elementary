package ru.job4j.loop;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;


import static org.junit.Assert.*;

public class FactorialTest {

    @Test
    public void factorialOneToFive() {
        int result = Factorial.calc(5);
        int expected = 120;
        assertThat(result, is(expected));
    }
}