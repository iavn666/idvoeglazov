package ru.job4j.loop;

public class Counter  {
    /**
     * Добавляет интервал и вычисляет сумму чётных чисел.
     * @param start первый конец интервала.
     * @param finish второй конец интервала.
     * @return сумма чётных чисел в интервале.
     */
    public int add(int start, int finish) {
        int result = 0;
        for (int i = start; i <= finish; i++) {
            if (i % 2 == 0) {
                result += i;
            }
        }
        return result;

        }


        }

