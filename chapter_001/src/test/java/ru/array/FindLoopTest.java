package ru.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FindLoopTest {
    @Test
    public void findloop() {
        FindLoop find = new FindLoop();
        int result = find.indexOf(new int[]{0,1,2},2);
        int[] expected = new int[] {0};
        assertThat(result, is(expected));



    }
}
