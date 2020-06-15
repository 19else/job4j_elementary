package ru.job4j.loop;

public class SqNumber {
    public static void main(String[] args) {
        calc(5);
        calc(6);
    }

    public static void calc(int n) {
        int hold = 0;
        for (int index = 0; index <= n; index++) {
            hold += index;

            if (hold == n) {
                System.out.println("Success " + hold);
                break;
            } else if (hold > n) {
                System.out.println("Not possible " + n);
                break;
            }

        }
    }
}

