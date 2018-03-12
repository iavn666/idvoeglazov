package ru.job4j.loop;

/**
 * @author ivan Dvoeglazov (ivan.vanya.2012@inbox.ru)
 * @version 1
 * @since 12.03.2018
 */

public class Factorial {


    public int calc(int n) {

        /*
        * Обьявляем переменую равню одному
         */

        int fact = 1;
        /*
        *Создаем цикл с условием при котором переменная (а) будет меньше или равна (n), и будет
        * увеличиваться каждый раз на единицу а++
         */

        for (int a = 1; a <= n; a++) {
            /*
            *Условие при котором будет выполняться произведение
             */
            if (a > 0);
            /*
            * Операция произведения fact = fact * a
             */
             fact *= a;
            }
            /*
            *Возвращаем полученное значение
             */
        return fact;

    }
}
