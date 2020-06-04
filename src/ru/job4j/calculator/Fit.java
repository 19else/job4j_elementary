package ru.job4j.calculator;

public class Fit {

    public static double menWeight (short height) {

        double result = (height - 100) * 1.15;
        return result;
    }

    public static double womanWeight (short height) {

        double result = (height - 110) * 1.15;
        return result;
    }

    public static void main (String [] args) {

        short manHeight = 182;
        short womanHeight = 167;
        double men = Fit.menWeight(manHeight);
        double woman = Fit.womanWeight(womanHeight);
        System.out.println("Man 182 is " + men + " kg");
        System.out.println("Woman 167 is " + woman + " kg");

    }
}

