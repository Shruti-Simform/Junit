package com.junitproject.junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculateSumTest {

    @Test
    void test() {
        assertEquals(12, new CalculateSum().calculateSum(new int[]{2, 4, 6}));
    }

    @Test
    void testZero() {
        assertEquals(0,new CalculateSum().calculateSum(new int[]{}));
    }
}