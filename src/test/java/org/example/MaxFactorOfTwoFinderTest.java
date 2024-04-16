package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxFactorOfTwoFinderTest {

    @Test
    @DisplayName("0 is 0")
    void findMaxFactorOfTwo0to0() {
        assertEquals(0, MaxFactorOfTwoFinder.findMaxFactorOfTwo(0));
    }
    @Test
    @DisplayName("1 is 0")
    void findMaxFactorOfTwo1to0() {
        assertEquals(0, MaxFactorOfTwoFinder.findMaxFactorOfTwo(1));
    }

    @Test
    @DisplayName("2 is 1")
    void findMaxFactorOfTwo2to1() {
        assertEquals(1, MaxFactorOfTwoFinder.findMaxFactorOfTwo(2));
    }

    @Test
    @DisplayName("3 is 1")
    void findMaxFactorOfTwo3to1() {
        assertEquals(1, MaxFactorOfTwoFinder.findMaxFactorOfTwo(3));
    }

    @Test
    @DisplayName("4 is 2")
    void findMaxFactorOfTwo4to2() {
        assertEquals(2, MaxFactorOfTwoFinder.findMaxFactorOfTwo(4));
    }

    @Test
    @DisplayName("5 is 2")
    void findMaxFactorOfTwo5to2() {
        assertEquals(2, MaxFactorOfTwoFinder.findMaxFactorOfTwo(5));
    }

    @Test
    @DisplayName("8 is 3")
    void findMaxFactorOfTwo8to3() {
        assertEquals(3, MaxFactorOfTwoFinder.findMaxFactorOfTwo(8));
    }
}