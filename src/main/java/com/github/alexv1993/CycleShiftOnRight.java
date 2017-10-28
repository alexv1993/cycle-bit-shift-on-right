package com.github.alexv1993;

/**
 * Created by Alex on 28.10.2017.
 */
public class CycleShiftOnRight {
    public static void main(String[] args) {
        int num = 0b10000000000000000000000000000000;


        for (int i = 0; i < 31; i++) {
            System.out.println("Before shift " + Integer.toBinaryString(num) + " " + num);
            num >>= 1;
            System.out.println("After shift  " + Integer.toBinaryString(num) + " " + num);
        }
    }
}
