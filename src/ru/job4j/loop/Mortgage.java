package ru.job4j.loop;

public class Mortgage {

     public int year(int amount, int salary, double percent) {

         int year = 0;
         percent = 1.0 + percent / 100;
         double sum;
         sum = (amount * percent) - salary;
          if (sum > 0) {
             year = 1;

             do {
                 // Начисление процентов банком
                 sum *= percent;
                 System.out.println("Начисление банку %  = " + sum);

                 //мы оплатили банку
                 sum -= salary;
                 System.out.println(" Мы оплатили банку = " + sum);

                 // период 1 год
                 year++;

                 System.out.println("Прибавили год счетчику " + year);

             } while (sum >= 0);

         } else {
             year++;
         }

         return year;

        }

     }



