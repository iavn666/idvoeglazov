package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author ivan Dvoeglazov (ivan.vanya.2012@inbox.ru)
 * @version 1
 * @since 0.1
 */


public class CounterTest {
    @Test
    /**
     * Тестирует метод whenSumEvenNumbersFromOneToTenThenThirty.
     */
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        /*
         * Создаем переменную count со ссылкой на обьект Counter,  до этого ранее созданный
        */
        Counter count = new Counter();
        /*
        *Объявляем переменную result ссылаясь через переменную count на обьект Counter и на его метод add
        * вносим тестируемые значения
         */
        int result = count.add(1,10);
        /*
        *Объявляем переменную expected тоесть ожидаемое значение которое должны получить по результату теста
         */
        int expected = 30;
        /*
        *Сравниваем полученное значение от метода add c ожидаемым
         */
        assertThat(result, is(expected));

        //напишите здесь тест, проверяющий, что сумма чётных чисел от 1 до 10 при вызове метода counter.add будет равна 30.
    }
}