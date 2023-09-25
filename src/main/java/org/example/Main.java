package org.example;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class BoardTest {

    @Test
    public void test1() {
        assertArrayEquals(new int[]{0, 0}, new int[]{0, 1});

        int[][] expected = new int[][]{{0, 1}};
        int[][] actual = new int[][]{{0, 1}};
        assertTrue(Arrays.deepEquals(expected, actual));
    }

}

