package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        if (args == null) {
            return;
        }
        System.out.println(BinaryDecimalConverter.convertDecimalToBinary(args));
    }
}
