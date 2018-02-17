package ru.job4j.calculator;

/**
 * Calculator математические операции:
 * сложение, вычитание, умножение и деление.
 *
 * @author Dvoeglazov Ivan (ivan.vanya.2012@inbox.ru)
 * @version 1
 * @since 0.1
 */

public class Calculator {
    /**
     * Содержит результат вычислительной операции.
     */
    private double result;
    /**
     * Производит операцию сложения над двумя числами.
     * @param first первое слагаемое.
     * @param second второе слагаемое.
     */

    public void addition(double first, double second) {
        this.result = first + second;
    }
    /**
     * Производит операцию вычитания над двумя числами.
     * @param first первое слагаемое.
     * @param second второе слагаемое.
     */

    public void subtraction(double first, double second) {
        this.result = first - second;
    }
    /**
     * Производит операцию умножения над двумя числами.
     * @param first первое слагаемое.
     * @param second второе слагаемое.
     */
    public void multi(double first, double second) {
        this.result = first * second;
    }
    /**
     * Производит операцию деления над двумя числами.
     * @param first первое слагаемое.
     * @param second второе слагаемое.
     */
    public void segmentation(double first, double second) {
        this.result = first / second;
    }
    /**
     * Возвращает результат вычислительной операции.
     * @return результат.
     */
    public double getResult() {
        return this.result;
    }
}