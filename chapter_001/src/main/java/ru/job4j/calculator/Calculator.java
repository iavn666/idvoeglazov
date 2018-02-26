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

    private double result;


    public void addition(double first, double second) {
        this.result = first + second;
    }


    public void subtraction(double first, double second) {
        this.result = first - second;
    }

    public void multi(double first, double second) {
        this.result = first * second;
    }

    public void segmentation(double first, double second) {
        this.result = first / second;
    }

    public double getResult() {
        return this.result;
    }
}