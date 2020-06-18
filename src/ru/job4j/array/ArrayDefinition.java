package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        String[] names = new String[4];
        names[0] = "Sergey Elovikov";
        names[1] = "Sergey Seleznev";
        names[2] = "Andrey Petrov";
        names[3] = "Mike Portnov";

        System.out.println(names[0] + ", " + names[3] + ", "  + names[1] + ", " + names[2]);
    }
}
