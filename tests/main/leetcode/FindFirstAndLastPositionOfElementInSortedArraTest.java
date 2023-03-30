package main.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindFirstAndLastPositionOfElementInSortedArraTest {

    @Test
    void findFirstElement() {
        int[] arr = {5, 7, 7, 7, 7, 10, 11, 23};
        int target = 7;

        FindFirstAndLastPositionOfElementInSortedArra obj = new FindFirstAndLastPositionOfElementInSortedArra();
        int[] expected = {1, 4};
        int[] output = obj.getValues(arr, target);
        assertArrayEquals(expected, output);
    }
}