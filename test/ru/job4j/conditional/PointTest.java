package ru.job4j.conditional;

import org.junit.Test;
import org.junit.Assert;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void distanceBetweenToPoints() {

    int x1 = 0;
    int y1 = 0;
    int x2 = 2;
    int y2 = 0;
    int expected = 2;

    double out = Point.distance(x1, y1, x2, y2);
    Assert.assertEquals(out, expected, 0.01);

    }
}