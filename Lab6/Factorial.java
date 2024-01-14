package Lab6;
//package com.arrsoft.number.util;
// KHAN MOHD OWAIS RAZA
// 20BCD7138
// DEC 2021
public class Factorial {
    public static int calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calculateFactorial(n - 1);
        }
    }
}
