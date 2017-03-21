package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       String Name = "Вася";
       System.out.println("Hello World " + Name);
       int firstNumber = 0, secondNumber = 0;
       int sum;
        System.out.println("Введи первое число");
        Scanner scn = new Scanner(System.in);
        firstNumber = scn.nextInt();
        System.out.println("Введи второе число");
        secondNumber = scn.nextInt();
        sum = firstNumber + secondNumber;
        System.out.println(firstNumber + "+" + secondNumber + "=" + sum);
    }


}
