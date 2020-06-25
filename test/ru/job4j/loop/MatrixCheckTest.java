package ru.job4j.loop;

import org.junit.Test;
import ru.job4j.array.Matrix;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class MatrixCheckTest {

    @Test
    public void whenHasMonoHorizontal() {
        char[][] input = {
                {' ', ' ', ' '},
                {'X', 'X', 'X'},
                {' ', ' ', ' '},

        };
        boolean result = MatrixCheck.monoHorizontal(input, 1);
        assertThat(result, is(true));

    }

    @Test
    public void whenMonoVertical() {
        char[][] input = {
                {' ', ' ', 'X'},
                {' ', ' ', 'X'},
                {' ', ' ', 'X'},
        };
        boolean result = MatrixCheck.monoVertical(input, 2);
        assertThat(result, is(true));
    }
}