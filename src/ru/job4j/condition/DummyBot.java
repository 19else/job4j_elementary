package ru.job4j.condition;

public class DummyBot {
    public static String answer(String quastion) {
        String result = "Это ставит меня в тупик. Задайте другой вопрос";
        if ("Привет, бот".equals(quastion)) {
            result = "Привет, Умник";
        } else {
            if ("Пока".equals(quastion)) {
                result = "До скорой встречи!";
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String result = DummyBot.answer("Привет, бот");
        System.out.println(result);
        result = DummyBot.answer("Который час?");
        System.out.println(result);
        result = DummyBot.answer("Пока");
        System.out.println(result);
    }
}
