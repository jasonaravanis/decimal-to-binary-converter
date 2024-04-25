package org.example;

public class Main {
    public static void main(String[] args) {
        if (args == null) {
            return;
        }
        System.out.println("Converting " + args[0]);
        System.out.println(BinaryDecimalConverter.convertDecimalToBinary(args));
    }
}
