package ru.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FindLoopTest {
    @Test
    public void findloop() {
        FindLoop find = new FindLoop();
        int result = find.indexOf(new int[]{1,2,3},2);
        int expected = 1;
        assertThat(result, is(expected));


    }

    @Test
    public void nofindloop() {
        FindLoop find = new FindLoop();
        int result = find.indexOf(new int[]{1, 2, 3}, 0);
        int expected = -1;
        assertThat(result, is(expected));
    }

}
