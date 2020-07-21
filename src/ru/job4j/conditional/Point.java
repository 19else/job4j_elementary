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
    /**
     * Это поле объекта. Оно доступно только конкретному объекту.
     */
    private int z;

    /**
     * Конструтор, который принимает начальное состояние объекта "точка"
     * @param first координата x
     * @param second координата y
     */
    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }
    /**
     * Конструтор, который принимает начальное состояние объекта "точка"
     * @param x координата x
     * @param y координата y
     * @param z координата z
     */

    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double distance(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
    }

    public double distance3d(Point that) {
        return sqrt(pow(that.x - this.x, 2) + (pow(that.y - this.y, 2) + (pow(that.z - this.z, 2))));
    }

    public void info() {
        System.out.println(String.format("Point [%s, %s]", this.x, this.y));

    }

    public void info3d() {
        System.out.println(String.format("Point [%s, %s, %s]", this.x, this.y, this.z));
    }

    public static void main(String[] args) {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        Point first = new Point(0, 0, 0);
        Point second = new Point(1, 1, 1);
        double dist3d = first.distance3d(second);
        double dist = a.distance(b);
        a.info();
        System.out.println("dist = " + dist);
        second.info3d();
        System.out.println("dist3d = " + dist3d);
    }

    public static double distance(int x1, int y1, int x2, int y2) {
        double calc = Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2);
        return Math.sqrt(calc);
    }
 }
