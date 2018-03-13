package ru.job4j.calculator;

/**
 * Программа расчета идеального веса.
 * @author Dvoeglazov Ivan (ivan.vanya.2012@inbox.ru)
 * @version 1
 * @since 0.1
 */
public class Fit {
    /**
     * Обьевляем переменные для формулы, мужчины (рост - 100) * 1,15.
     * Обьевляем переменные для формулы, женщины (рост - 110) * 1,15.
     * @param man мужчины.
     * @param woman женщины.
     */

    public static final double MAN = 100;
    public static final double CONSTANT = 1.15;
    public static final double WOMAN = 110;

    /**
     * Идеальный вес для мужщины.
     * @param height Рост.
     * @return идеальный вес.
     */

    double manWeight(double height) {
        return (height - MAN) * CONSTANT;
    }

    /**
     * Идеальный вес для женщины.
     * @param height Рост.
     * @return идеальный вес.
     */

    double womanWeight(double height) {
        return (height - WOMAN) * CONSTANT;
    }
}