package com.lab8.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {

    Calculator c = new Calculator();

    @Test
    public void testAdd() {
        Assert.assertEquals(c.add(2,3), 5);
    }

    @Test
    public void testSub() {
        Assert.assertEquals(c.sub(5,3), 2);
    }

    @Test
    public void testMul() {
        Assert.assertEquals(c.mul(3,4), 12);
    }

    @Test
    public void testDiv() {
        Assert.assertEquals(c.div(10,2), 5);
    }
}
