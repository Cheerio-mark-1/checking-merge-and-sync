package main.algorithums.search;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;
import static main.algorithums.search.BinarySearch.*;

class BinarySearchTest {

    int[] arr = {2, 4, 6, 9, 11, 12, 14, 20, 36, 48};
    int[] arrDes = {48, 36, 20, 14, 12, 11, 9, 6, 4};

    BinarySearch obj = new BinarySearch();

    @Test
    void BinarySearchTest1() {
        assertEquals(8, obj.orderAgnosticBS(arr, 36));
    }

    @Test
    void BinarySearchTest2() {
        assertEquals(2, obj.orderAgnosticBS(arr, 6));
    }

    @Test
    void BinarySearchTest3() {
        assertEquals(-1, obj.orderAgnosticBS(arr, 54));
    }

    @Test
    void BinarySearchTest4() {
        assertEquals(-1, obj.orderAgnosticBS(arr, 10));
    }

    @Test
    void BinarySearchTest5() {
        assertEquals(8, obj.orderAgnosticBS(arrDes, 4));
    }

}