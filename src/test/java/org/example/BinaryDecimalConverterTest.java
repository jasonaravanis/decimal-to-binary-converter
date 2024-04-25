package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryDecimalConverterTest {

    @Test
    @DisplayName("Renders error message if no value provided")
    void convertEmpty() {
        String[] emptyStringArray = new String[0];
        assertEquals(BinaryDecimalConverter.convertDecimalToBinary(emptyStringArray), "No number value provided");
    }

    @Test
    @DisplayName("Renders error message if provided value is not a number")
    void convertNaN() {
        String[] notANumber = {"Apple"};
        assertEquals(BinaryDecimalConverter.convertDecimalToBinary(notANumber), "Provided value not a decimal number");
    }

    @Test
    @DisplayName("Converts '8'")
    void convert8() {
        String[] number = {"8"};
        assertEquals("00000000000000000000000000001000", BinaryDecimalConverter.convertDecimalToBinary(number));
    }

    @Test
    @DisplayName("Converts '2048'")
    void convert2048() {
        String[] number = {"2048"};
        assertEquals("00000000000000000000100000000000", BinaryDecimalConverter.convertDecimalToBinary(number));
    }

    @Test
    @DisplayName("Converts '19'")
    void convert19() {
        String[] number = {"19"};
        assertEquals("00000000000000000000000000010011", BinaryDecimalConverter.convertDecimalToBinary(number));
    }
}