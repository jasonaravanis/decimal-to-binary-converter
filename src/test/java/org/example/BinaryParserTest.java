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

    @Test
    void convertBinaryToDecimal() {
        int[] b1 = {0,0,0,0};
        assertEquals(0, BinaryParser.convertBinaryToDecimal(b1));

        int[] b2 = {0,0,0,1};
        assertEquals(1, BinaryParser.convertBinaryToDecimal(b2));

        int[] b3 = {0,0,1,1};
        assertEquals(3, BinaryParser.convertBinaryToDecimal(b3));

        int[] b4 = {0,1,0,1};
        assertEquals(5, BinaryParser.convertBinaryToDecimal(b4));
    }
}