package ru.job4j.loop;

public class CheckPrimeNumber {

    public static boolean check(int number) {
        boolean prime = true;
        int sum = 0;
        for (int index = 0; index < number; index++) {
            sum += index;
            if (number % 2 == 0 && number % number == 0)  {
                prime = false;
                break;
            } else {
                prime = true;
            }
        }
        return prime;
    }

}
