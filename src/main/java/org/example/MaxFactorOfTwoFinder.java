package org.example;

public class MaxFactorOfTwoFinder {

    public static int findMaxFactorOfTwo(int value) {
        int maxFactorOfTwo = 0;
        boolean iterateMaxFactorOfTwo = true;


        while (iterateMaxFactorOfTwo) {
            if (Math.pow(2, maxFactorOfTwo + 1) <= value) {
                maxFactorOfTwo++;
            } else {
                iterateMaxFactorOfTwo = false;
            }
        }

        return maxFactorOfTwo;
    }
}
