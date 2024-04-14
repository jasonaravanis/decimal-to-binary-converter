package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryDecimalConverterTest {

    @Test
    @DisplayName("Renders error message if no value provided")
    void convert() {
        String[] emptyStringArray = new String[0];
        assertEquals(BinaryDecimalConverter.convert(emptyStringArray), "No number value provided");
    }
}