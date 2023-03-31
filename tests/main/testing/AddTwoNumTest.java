package main.testing;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AddTwoNumTest {
    AddTwoNum obj = new AddTwoNum();

    @Test
    public void TestNewSum1() {
        assertEquals(25, obj.newSum(10, 15));
    }

    @Test
    public void TestNewSum2() {
        assertEquals(15, obj.newSum(10, 5));
    }

    @Test
    public void TestNewSum3() {
        assertEquals(-10, obj.newSum(20, -10));
    }

    @Test
    public void TestNewSum4() {
        assertEquals(25, obj.newSum(10, -15));
    }

    @Test
    public void TestNewSum5() {
        assertEquals(30, obj.newSum(-10, 20));
    }

}