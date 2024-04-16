package org.example;

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

       int maxFactorOfTwo = MaxFactorOfTwoFinder.findMaxFactorOfTwo(decimalValue);








        return "Something went wrong";
    }

}
