package ru.job4j.loop;

public class Mortgage {
     public int year(int amount, int salary, double percent) {
         int year = 0;
         double sum = 0;

             do {

                 //Кредитная задолжность за 1 год Это вычисление надо сделать один раз.
                 // но если его вынести за do то sum правильно использовать не смогу? Ввести еще одну переменную?
                 // тогда лучше включить условие if для случаев погашения в первый год...
                 sum = amount * (percent / 100) + amount - salary;
                 year += 1;

                 // кредит.задолжн. за 2 год - это повторение, которое нужно включить цикл?
                 sum = sum + sum * (percent / 100) - salary;
                 year += 1;


             } while (sum <= 0);

         return year;
         }
     }



