package ru.job4j.condition;

public class Tour {
    public static void offer(boolean passport) {
        System.out.println("A client is foreign passport " + passport);
        if (passport) {
            System.out.println(" Tours aboard");
        } else {
            System.out.println(" Tour in Russia");
        }
    }

    public static void main(String[] args) {
        Tour.offer(true);
        Tour.offer(false);
    }

}
