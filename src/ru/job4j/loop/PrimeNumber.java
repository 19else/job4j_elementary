package ru.job4j.loop;

public class PrimeNumber {

    public int calc(int finish) {
        int count = 0;

        int number = 1;
        boolean check = CheckPrimeNumber.check(number);
        for (number = 1; number <= finish; number++) {
            if (CheckPrimeNumber.check(number)) {

                count += 1;

            }

        }
        return count;
    }
}
