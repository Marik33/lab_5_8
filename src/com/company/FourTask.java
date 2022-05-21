package com.company;

import java.sql.Struct;

public class FourTask {

    public static void main(String[] args) {

        String Agree = "Так";
        String answer;

        switch (Agree) {
            case "Так":
            case "OK":
            case "Yes":
            case "Y":
            case "+":
            case "Ok":
                answer = "Так";
                System.out.println("Я погоджуюсь!");
                break;
            case "Hi":
            case "No":
            case "N":
            case "-":
            case "NO":
                answer = "No";
                System.out.println("Я відмовляюсь!");
                break;
            default:
                System.out.println("Ви вказали не правильне значення.");
        }
    }
}
