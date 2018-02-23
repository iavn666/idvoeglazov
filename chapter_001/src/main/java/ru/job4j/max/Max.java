package ru.job4j.max;
/**
 * @author ivan Dvoeglazov (ivan.vanya.2012@inbox.ru)
 * @version 1
 * @since 0.1
 */
public class Max {
    /**
     * Проверяем переменные на максимальное значение
     *
     */
   public int max (int first, int second, int third) {
       /**
        * Вычисляем максимакльное значение через Math.max
        *
        */

       return (Math.max(first, Math.max (second, third)));
    }


}
