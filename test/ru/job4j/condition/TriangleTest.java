package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TriangleTest {

    @Test
    public void whenExit() {
        boolean result = Triangle.exit(2, 2, 2);
        assertThat(result, is(true));
    }

    @Test
    public void whenNoExit() {
        boolean result = Triangle.exit(1, 2, 3);
        assertThat(result, is(false));
    }
}