package com.company;

public class FirstTask {

    public static void main(String[] args) {

        int n = 70;

        if (n >= 50 || n <= 100) {
            System.out.println("Число " + n + " міститься в проміжку (50; 100).");
        }
        else if (n < 50 || n > 100) {
            System.out.println("Число " + n + " не міститься в проміжку (50; 100).");
        }
    }
}
