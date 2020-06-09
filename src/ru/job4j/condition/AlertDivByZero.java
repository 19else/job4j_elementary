package ru.job4j.condition;

public class AlertDivByZero {
    public static void main(String[] args) {
        possibleDiv(1);
        possibleDiv(-2);
    }

        public static void possibleDiv(int number) {
          if (number < 0) {
            System.out.println(" This is negative number - " + number);
        }
          if (number == 0) {
              System.out.println("Can't div by zero - " + number);
          }
    }
}
