package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        ages[0] = 30;
        String[] surnames = new String[100500];
        surnames[0] = "Name/Surname";
        float[] prices = new float[40];
        prices[0] = 15;
        String[] names = new String[4];
        names[0] = "Sergey Elovikov";
        names[1] = "Sergey Seleznev";
        names[2] = "Andrey Petrov";
        names[3] = "Mike Portnov";
        System.out.println(names[0] + ", " + names[3] + ", "  + names[1] + ", " + names[2]);
        System.out.println(surnames[0] + " " + names[0] + " " + ages[0] + " " + prices[0]);
            }
}
