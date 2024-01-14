package Lab6;
//package com.arrsoft.number.util;
// KHAN MOHD OWAIS RAZA
// 20BCD7138
// DEC 2021
public class NumberUtilTest {
    public static void main(String[] args) {
        // Test Armstrong
        int armstrongNumber = 153;
        System.out.println(armstrongNumber + " is Armstrong? " + Armstrong.isArmstrong(armstrongNumber));
        // Test Palindrome
        int palindromeNumber = 121;
        System.out.println(palindromeNumber + " is Palindrome? " + Palindrome.isPalindrome(palindromeNumber));
        // Test Factorial
        int factorialNumber = 5;
        System.out.println("Factorial of " + factorialNumber + " is " + Factorial.calculateFactorial(factorialNumber));
    }
}
