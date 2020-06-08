package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

import static org.junit.Assert.*;

public class SqAreaTest {

    @Test
    public void rectangle() {
        int k = 2;
        int p = 6;
        double expected = 4.0;
        double out = SqArea.square(p, k);
        assertEquals(out, expected, 0.01);
    }
}