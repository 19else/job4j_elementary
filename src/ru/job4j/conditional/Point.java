package ru.job4j.conditional;
import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class Point {
    /**
     * Это поле объекта. Оно доступно только конкретному объекту
     */
    private int x;

    /**
     * Это поле объекта. Оно доступно только конкретному объекту.
     */
    private int y;

    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }

    public double distance(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
    }

    public static void main(String[] args) {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double dist = a.distance(b);
        System.out.println(dist);
    }

    public static double distance(int x1, int y1, int x2, int y2) {
        double calc = Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2);
        return Math.sqrt(calc);
    }
 }
