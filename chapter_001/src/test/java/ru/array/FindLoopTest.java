package ru.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FindLoopTest {
    @Test
    public void findloop() {
        FindLoop find = new FindLoop();
        int  result = find.indexOf(5);
        int [] expected = new int[] {1};
        assertThat(result, is(expected));

    }

}
