package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryParserTest {

    @Test
    void toIntArray() {
        String testString = "0000";
        int[] expected = {0,0,0,0};
        assertArrayEquals(expected, BinaryParser.toIntArray(testString));
    }

    @Test
    void toIntArrayTwo() {
        String testString = "0101";
        int[] expected = {0,1,0,1};
        assertArrayEquals(expected, BinaryParser.toIntArray(testString));
    }
}