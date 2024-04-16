package org.example;

import java.util.stream.IntStream;

public class BinaryParser {

    public static int[] toIntArray(String string) {
        int[] result = string.chars().map(ch -> ch == '1' ? 1 : 0).toArray();
        return result;
    }

}
