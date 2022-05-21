package com.company;

public class TwoTask {

    public static void main(String[] args) {


        int n = 235;
        int a = n / 100;
        int b = (n / 10) % 10;
        int c = n % 10;
        if (n > 99) {
            if (a > b && a > c) {
                System.out.println(a);
            } else if (b > a && b > c) {
                System.out.println(b);
            } else if (c > a && c > b) {
                System.out.println(c);
            } else {
                System.out.println("Попробуйте ще раз.");
            }
        } else {
            System.out.println("Це не вірне число.");
        }
    }
}