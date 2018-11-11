package com.techbeo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.engine.JupiterTestEngine;
import org.junit.runner.RunWith;


public class MathUtilTest {

    @DisplayName("Verify GCD for {12,30} ")
    @Test
    public void verifyGCDCalc() {
        Assertions.assertEquals(6, MathUtil.calculateGCD(12, 30));
    }

    @DisplayName("Verify GCD for {0,30} ")
    @Test
    public void verifyGCDCalcWithZero() {
        Assertions.assertEquals(30, MathUtil.calculateGCD(0, 30));
    }

    @DisplayName("Verify GCD for {1,30} ")
    @Test
    public void verifyGCDCalcWithOne() {
        Assertions.assertEquals(1, MathUtil.calculateGCD(1, 30));
    }

    @DisplayName("Verify GCD for {150, 3000} ")
    @Test
    public void verifyGCDCalc2() {
        Assertions.assertEquals(150, MathUtil.calculateGCD(150, 3000));
    }
}