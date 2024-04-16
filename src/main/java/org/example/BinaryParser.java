package org.example;

import java.util.stream.IntStream;

public class BinaryParser {

    public static int[] toIntArray(String string) {
        int[] result = string.chars().map(ch -> ch == '1' ? 1 : 0).toArray();
        return result;
    }

    public static int convertBinaryToDecimal(int[] binary) {
        int sum = 0;
        int index = binary.length - 1;
        while (index >= 0) {
            int bit = binary[index];
            if (bit == 1) {
                sum += Math.pow(2, binary.length - index - 1);
            }
            index--;
        }
        return sum;
    }

}
