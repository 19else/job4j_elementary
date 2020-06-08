package ru.job4j.calculate;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;


import org.hamcrest.Matcher;
import org.junit.Test;

   public class X2Test {
    @Test
    public void whenBCZero() {
        /* 4 входных пораметра*/
        int a = 10;
        int b = 0;
        int c = 0;
        int x = 2;

        /* Ожидаемое значение - всегда одна переменная*/
        int expected = 40;
        /* Вызов метода, который хотим проверить */

        int result = X2.calc(a, b, c, x);
        /* Результат вычисления - всегда одна переменная */

        /*Сравнение полученного значения с ожидаемым */
        assertThat(result, is(expected));
    }

       @Test
       public void allIsOne() {
           /* 4 входных пораметра*/
           int a = 1;
           int b = 1;
           int c = 1;
           int x = 1;

           /* Ожидаемое значение - всегда одна переменная*/
           int expected = 3;
           /* Вызов метода, который хотим проверить */

           int result = X2.calc(a, b, c, x);
           /* Результат вычисления - всегда одна переменная */

           /*Сравнение полученного значения с ожидаемым */

           assertThat(result, is(expected));
       }

           @Test
           public void whenAZero() {
                /* 4 входных пораметра*/
                int a = 0;
                int b = 1;
                int c = 1;
                int x = 1;

                /* Ожидаемое значение - всегда одна переменная*/
                int expected = 2;
                /* Вызов метода, который хотим проверить */

                int result = X2.calc(a, b, c, x);
                /* Результат вычисления - всегда одна переменная */

                /*Сравнение полученного значения с ожидаемым */

                assertThat(result, is(expected));
            }

       @Test
       public void whenCZero() {
           /* 4 входных пораметра*/
           int a = 1;
           int b = 1;
           int c = 0;
           int x = 1;

           /* Ожидаемое значение - всегда одна переменная*/
           int expected = 2;
           /* Вызов метода, который хотим проверить */

           int result = X2.calc(a, b, c, x);
           /* Результат вычисления - всегда одна переменная */

           /*Сравнение полученного значения с ожидаемым */

           assertThat(result, is(expected));
       }

       @Test
           public void whenXZero() {
           /* 4 входных пораметра*/
           int a = 1;
           int b = 1;
           int c = 1;
           int x = 0;

           /* Ожидаемое значение - всегда одна переменная*/
           int expected = 1;
           /* Вызов метода, который хотим проверить */

           int result = X2.calc(a, b, c, x);
           /* Результат вычисления - всегда одна переменная */

           /*Сравнение полученного значения с ожидаемым */
           assertThat(result, is(expected));
       }
   }