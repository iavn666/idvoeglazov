package ru.array;
/**
 * @author ivan Dvoeglazov (ivan.vanya.2012@inbox.ru)
 * @version 1
 * @since 12.03.2018
 */

public class Square {

    public int[] calculate(int bound) {

        /*
        * Обьявили массив с длинной bound
         */

        int[] rst = new int[bound];
        rst [0] = 1;
        rst [1] = 2;
        rst [2] = 3;
        rst [3] = 4;
        rst [4] = 5;
        rst [5] = 6;

        /*
        * Цикл с условием и переменнай i, тагже указали что длинна массива (rst.length) будет больше
        * переменной i
         */
        for (int i = 0; rst.length > i; i++) {
            /*
            *Возводим переменную i в квадрат через Math.pow
             */
            rst[i] = (int) Math.pow(rst[i], 2);
                    }
                  return rst;

    }


}

