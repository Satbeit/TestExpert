package com.self.common;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assume.assumeTrue;

/**
 * Created by sanket on 10/19/2014.
 */

public class CalculationTest {

    Calculation cal ;

    @Test
    public void testAdditionWithNoramlNumber() {
        cal = new Calculation(0,0);
        int i = cal.add();
        Assert.assertEquals(i, 0);
    }

    @Test
    public void testAdditionWithOneMaxIntUpperBoundryNumber() {
        cal = new Calculation(0,Integer.MAX_VALUE);
        long i = cal.add();
        Assert.assertEquals(i, 2147483647);
    }

    @Test
    public void testAdditionWithBothMaxIntUpperBoundryNumber() {
        cal = new Calculation(Integer.MAX_VALUE,Integer.MAX_VALUE);
        int i = cal.add();
        assumeTrue(i== (Integer.MAX_VALUE + Integer.MAX_VALUE));
    }

    @Test
    public void testAssertFail(){
        cal = new Calculation(Integer.MAX_VALUE,0);
        int i = cal.division();
        Assert.fail("/ by zero");
    }
}
