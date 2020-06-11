package ru.job4j.loop;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

 @SuppressWarnings("checkstyle:EmptyLineSeparator")
 public class CounterTest {

    @Test
    public void whenSumByEvenNumbersFromOneToTenIsThirty() {
        int result = Counter.sumByEven(1, 10);
        int expected = 30;
        assertThat(result, is(expected));

    }

    @Test
    public void whenSumNumbersFromOneToSixIsTwentyOne() {
        int result = Counter.sum(1, 6);
        int expected = 21;
        assertThat(result, is(expected));
    }
}