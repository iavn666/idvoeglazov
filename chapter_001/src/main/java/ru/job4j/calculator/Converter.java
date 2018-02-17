package ru.job4j.calculator;

/**
 * Конвертер валют
 *
 * @author Dvoeglazov Ivan (ivan.vanya.2012@inbox.ru)
 * @version 1
 * @since 0.1
 */
public class Converter {

    /**
     * Содержит результат вычислительной операции.
     */
    private double result;

    /**
     * Обьявляем значения переменных
     */
    int euro = 70;
    int dollar = 60;
    int value;

    /**
     * Конвертируем рубли в евро.
     * @param value рубли.
     * @return Евро
     */

    public int rubleToEuro(int value) {
        /**
         * Арифметическая операция.
         */
         return value / euro;
    }
    /**
     * Конвертируем рубли в доллары.
     * @param value рубли.
     * @return Доллоры
     */
        public int rubleToDollar(int value) {
            /**
             * Арифметическая операция.
             */
        return value / dollar;
    }
    /**
     * Конвертируем доллары в рубли.
     * @param value Доллоры.
     * @return рубли.
     */

    public int DollarTorubli(int value) {
        /**
         * Арифметическая операция.
         */
        return  dollar * value;
    }
    /**
     * Конвертируем евро в рубли.
     * @param value евро.
     * @return рубли.
     */
    public int EuroTorubli(int value) {
        /**
         * Арифметическая операция.
         */
        return euro * value;
    }


}