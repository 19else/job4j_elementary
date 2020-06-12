package ru.job4j.loop;

public class Factorial {
    public static int calc(int n) {
        int result;
        int sum = 1;
        for (result = 1; result <= n; result++) {
            sum = sum * result;
               }
        return sum;
    }
}
