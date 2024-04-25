package org.example;

import java.util.Arrays;
import java.util.stream.Collectors;

public class BinaryDecimalConverter {

    public static String convertDecimalToBinary(String[] userInput) {

        Integer decimalValue = null;

        if (userInput.length == 0) {
            return "No number value provided";
        }

        try {
            decimalValue = Integer.parseInt(userInput[0]);
        } catch (NumberFormatException error) {
            return "Provided value not a decimal number";
        }

        int[] intArray = new int[32];

        int remainder = decimalValue;

        int binaryValueInDecimalForm = 0;


        while (remainder > 0) {
            int maxFactorOfTwo = MaxFactorOfTwoFinder.findMaxFactorOfTwo(remainder);
            binaryValueInDecimalForm += Math.pow(2, maxFactorOfTwo);
            intArray[32 - maxFactorOfTwo - 1] = 1;
            remainder = decimalValue - binaryValueInDecimalForm;
        }

        // I want to take each int from the intArray and push it into a string
        return Arrays.stream(intArray).mapToObj(String::valueOf).collect(Collectors.joining());

    }

}
