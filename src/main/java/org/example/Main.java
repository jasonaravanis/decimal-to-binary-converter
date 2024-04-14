package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Integer decimalValue = null;







        char[] charArray = new char[32];

        if (decimalValue == 0) {
            System.out.println(new String(charArray));
            return;
        }



        int maxDivisorIndex = 0;

        while (Math.pow(2, maxDivisorIndex) < decimalValue) {
            maxDivisorIndex++;
        }





        System.out.println(maxDivisorIndex);





    }
}
