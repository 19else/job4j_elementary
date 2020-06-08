package ru.job4j.calculator;

import org.junit.Test;
import org.junit.Assert;

import static org.junit.Assert.*;

public class FitTest {

    @Test
    public void whenMenHeight182ThenWheight94() {
        short height = 182;
        double expected = 94.3;

        double out = Fit.menWeight(height);
        Assert.assertEquals(out, expected, 0.01);
    }

    @Test
    public void whenWomanHeight167ThenWeight65() {
        short height = 167;
        double expected = 65.55;

        double out = Fit.womanWeight(height);
        Assert.assertEquals(out, expected, 0.01);
    }
}