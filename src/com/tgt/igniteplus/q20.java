package com.tgt.igniteplus;
import java.util.*;
public class q20 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a binary value:");
        int n = sc.nextInt();
        int num = n;
        int dec_value = 0;
        int base = 1;
        int temp = num;
        while (temp > 0) {
            int last_digit = temp % 10;
            temp = temp / 10;
            dec_value += last_digit * base;
            base = base * 2;
        }
        System.out.println(+dec_value);
    }
}
