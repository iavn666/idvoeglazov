package ru.array;

/**
 * @author ivan Dvoeglazov (ivan.vanya.2012@inbox.ru)
 * @version 1
 * @since 18.03.2018
 */

import org.junit.Test;

import static org.hamcrest.collection.IsArrayContainingInAnyOrder.arrayContainingInAnyOrder;
import static org.junit.Assert.assertThat;

public class ArrayDuplicateTest {
    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate() {
        String [] input = {"Привет", "Мир", "Привет", "Супер", "Мир"};
        String [] except = {"Привет", "Мир", "Супер"};
        ArrayDuplicate a = new ArrayDuplicate();
        String [] result = a.remove(input);
        assertThat(result,arrayContainingInAnyOrder(except));
        //напишите здесь тест, проверяющий удаление дубликатов строк из массива строк.
    }
    @Test
    public void whenRemoveThenArrayWithoutDuplicate() {

        String [] input = {"1", "1"};
        String [] except = {"1",};
        ArrayDuplicate a = new ArrayDuplicate();
        String [] result = a.remove(input);
        assertThat(result,arrayContainingInAnyOrder(except));
        //напишите здесь тест, проверяющий удаление дубликатов строк из массива строк.
    }
}