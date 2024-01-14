package Lab6;
//package com.arrsoft.number.util;
// KHAN MOHD OWAIS RAZA
// 20BCD7138
// DEC 2021
public class Armstrong {
    public static boolean isArmstrong(int n) {
        int temp, digit, sum = 0;
        temp = n;
        while (temp != 0) {
            digit = temp % 10;
            sum += Math.pow(digit, 3);
            temp /= 10;
        }
        return sum == n;
    }
}