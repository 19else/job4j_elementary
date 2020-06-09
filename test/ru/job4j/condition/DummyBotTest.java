package ru.job4j.condition;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertTrue;

public class DummyBotTest {
    @Test
    public void whenGreetBoot() {
        assertThat(
                DummyBot.answer("Привет, бот"),
                is("Привет, Умник")
        );
    }

    @Test
    public void whenBayBot() {
        assertThat(
                DummyBot.answer("Пока"),
                is("До скорой встречи!")
        );
    }

    @Test
    public void whenUnknownBot() {
        assertThat(
                DummyBot.answer("Сука!"),
                is("Это ставит меня в тупик. Задайте другой вопрос")
        );
    }

}