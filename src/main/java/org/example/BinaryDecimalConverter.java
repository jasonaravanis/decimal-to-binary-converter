package org.example;

import java.util.Arrays;

public class BinaryDecimalConverter {

    public static String convert(String[] userInput) {

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



       int maxFactorOfTwo = MaxFactorOfTwoFinder.findMaxFactorOfTwo(decimalValue);

       intArray[maxFactorOfTwo] = 1;







        return Arrays.toString(intArray);
    }

}
