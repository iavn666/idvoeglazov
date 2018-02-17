package ru.job4j.calculator;

/**
 * Корвертор валюты.
 */
public class Converter {

    /**
     * Содержит результат вычислительной операции.
     */
    private double result;

    /**
     * Обьявляем значения переменных
     */
    int Euro = 70;
    int Dollar = 60;
    int rubli;

    public int rubleToEuro(int rubli) {
        /**
         * Арифметическая операция.
         */
        result = rubli / Euro ;
        return -1;
    }
    /**
     * Конвертируем рубли в доллары.
     * @param value рубли.
     * @return Доллоры
     */
    public int rubleToDollar(int value) {
        result = Dollar / Euro ;
        return -1;
    }

}