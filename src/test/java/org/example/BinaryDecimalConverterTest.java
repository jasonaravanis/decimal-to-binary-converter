package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryDecimalConverterTest {

    @Test
    @DisplayName("Renders error message if no value provided")
    void convertEmpty() {
        String[] emptyStringArray = new String[0];
        assertEquals(BinaryDecimalConverter.convert(emptyStringArray), "No number value provided");
    }

    @Test
    @DisplayName("Renders error message if provided value is not a number")
    void convertNaN() {
        String[] notANumber = {"Apple"};
        assertEquals(BinaryDecimalConverter.convert(notANumber), "Provided value not a decimal number");
    }


}