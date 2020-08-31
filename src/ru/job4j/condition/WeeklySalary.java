package ru.job4j.condition;

public class WeeklySalary {
    @SuppressWarnings("checkstyle:InnerAssignment")
    public static int calculate(int[] hours) {
        int sum = 0;
        for (int index = 0; index < hours.length; index++) {
            int hour = hours[index];
            int oneHour = hour / 8;
            int sumBase = oneHour * 10 * 8;
            int sumHi = (hour - 8) * 15;
   // расчет первых 5 дней
            if (index < 5) {
                if (hour > 8) {
                    sum = sum + sumHi + sumBase;
                    System.out.println("Extra hours = " + hour + " Sum = " + sum);
                } else {
                    sum = sum + sumBase;
                    System.out.println("Base hours = " + hour + " Sum = " + sum);
                }
                //Расчет выходных дней
            } else  if (hour <= 8) {
                    sum = sum + sumBase * 2;
                } else {
                    sum = sum + (sumHi + sumBase) * 2;
                    System.out.println("day off = " + hour + " Sum = " + sum);
                }
            }

                //sum = sum + ((hours[index] - 8) * 15 + 8 * 10) * 2;
                // задача получается? На 3 пункте буксую. Где выходные считаются по 2тарифу. Ну и вообще, кажется ее можно
              //  проще решить. Огород нагородил.. Но первые 2 пункта решаются верно
                // тут достаточно индекс проверить который циклом управляет - если меньше 5 - значит будний день, иначе выходнной
                // а потом тернарным условием проверять - если больше 8 часов время - то расчет с бонусом, иначе - просто расчет
                // для выходным - аналогично, только увеличивается в 2 раза расчет

        return sum;
        }

    public static void main(String[] args) {
        int[] hours = {8, 8, 8, 8, 8, 0, 0};
        int[] hours1 = {10, 10, 10, 0, 8, 0, 0};
        int[] hours2 = {10, 0, 12, 0, 8, 4, 12};
        System.out.println(calculate(hours));
        System.out.println(calculate(hours1));
        System.out.println(calculate(hours2));
    }
}
