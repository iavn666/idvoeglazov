package ru.job4j.max;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
  * @author ivan Dvoeglazov (ivan.vanya.2012@inbox.ru)
  * @version 1
  * @since 0.1
  */

public class MaxitTest {

    /**
     * Тестирует метод whenFirstLessSecond.
     */
    @Test
    public void whenFirstLessSecond() {
        Maxit maxim = new Maxit();
        int result = maxim.summation(5, 10);
        assertThat(result, is(10));
    }
}
