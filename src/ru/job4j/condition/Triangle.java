package ru.job4j.condition;

public class Triangle {
    public static boolean exit(double ab, double ac, double bc) {
        return     ab + ac > bc
                && ac + bc > ab
                && ab + bc > ac;
        }

    public static void main(String[] args) {
        boolean result = Triangle.exit(2, 2, 2);
        System.out.println("Является ли фигура треугольником? " + result);
            }
}
