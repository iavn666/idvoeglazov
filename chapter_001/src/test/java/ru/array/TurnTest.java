package ru.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TurnTest {
    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        Turn massive = new Turn();
        int [] resultArray = massive.back(new int[]{1, 2, 3, 4, 5});
        int [] expectArray = new int[]{5,4,3,2,1};
        assertThat(resultArray, is(expectArray));

    }

    @Test
    public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
        Turn massive = new Turn();
        int [] resultArray = massive.back(new int[]{2, 6, 1, 4});
        int [] expectArray = new int[]{4,1,6,2};
        assertThat(resultArray, is(expectArray));

    }
}