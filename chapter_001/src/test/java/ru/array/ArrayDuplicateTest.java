package ru.array;

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
}