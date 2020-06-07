package ru.job4j.converter;

public class Converter {

    public static int rubleToEuro(int value) {

        return value / 70;
    }

    public static int rubleToDollar(int value) {

        return value / 60;
    }

    public static void main(String[] args) {
        int in = 140;
        int expected = 2;
        int out = rubleToEuro(in), outD = rubleToDollar(in);
        boolean passed = expected == out;
        boolean passedD = expected == outD;
        int euro = Converter.rubleToEuro(140);
        int dollar = Converter.rubleToDollar(140);

        System.out.println("140 rubles are " + euro + " euro");
        System.out.println("140 rubles are 2. Test result : " + passed);
        System.out.println("140 rubles are " + dollar + " dollar");
        System.out.println("140 rubles are 2. Test result : " + passedD);
    }
}
