package Lab6;
//package com.arrsoft.number.util;
// KHAN MOHD OWAIS RAZA
// 20BCD7138
// DEC 2021
public class Palindrome {
    public static boolean isPalindrome(int n) {
        int original = n, reversed = 0, remainder;
        while (n != 0) {
            remainder = n % 10;
            reversed = reversed * 10 + remainder;
            n /= 10;
        }
        return original == reversed;
    }
}