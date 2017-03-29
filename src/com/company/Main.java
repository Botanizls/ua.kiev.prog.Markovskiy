package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*///Part1
        ///Задача 1,2
        Scanner nm = new Scanner(System.in);
        String Name = "";
        System.out.println("Введите имя");
        Name = nm.nextLine();
        System.out.println("Hello World " + Name);

        ///Задача 3, 4
        int firstNumber = 0, secondNumber = 0;
        int sum;
        System.out.println("Введи первое число");
        Scanner scn = new Scanner(System.in);
        firstNumber = scn.nextInt();
        System.out.println("Введи второе число");
        secondNumber = scn.nextInt();
        sum = firstNumber + secondNumber;
        System.out.println(firstNumber + "+" + secondNumber + "=" + sum);

        ///Задача 5
        int i = 0;
        System.out.println(i);
        i = ++i;
        System.out.println(i);
        i = i++;
        System.out.println(i);

        ///Задача 6, 7
        boolean bar = true;
        System.out.println("!" + bar);
        boolean bar2 = false;
        System.out.println("!" + bar2);

        ///Задача 8 - 13
        boolean a = true;
        boolean b = false;
        boolean x = a | b;
        System.out.println(x);
        x = a & b;
        System.out.println(x);
        x = a ^ b;
        System.out.println(x);
        x = b |= a;
        System.out.println(x);
        x = a ^= b;
        System.out.println(x);
        x = a &= b;
        System.out.println(x);

        ///Задача 14
        char ch1, ch2, ch3, ch4;
        ch1 = 74;
        ch2 = 97;
        ch3 = 118;
        ch4 = 97;
        System.out.println(ch1+""+ch2+""+ch3+""+ch4);

        ///Задача 15
        int x1 = 13;
        int y1 = 1;
        System.out.println(x1 < 10 && y1 > 3);

        ///Part 2
        ///Задача 1
        int x2 = 10;
        int y2 = 4;
        int z2 = 1;

        System.out.println("!"+(x2>y2&&y2>z2));

        ///Задача 2,3
        double d = 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1;
        System.out.println(d);

        float f  = 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f;
        System.out.println(f);

        ///Задача 4, 5
        int aa = 3;
        int bb = 5;
        int cc = 7;
        System.out.println(aa + bb * cc);
        System.out.println((aa+bb)*cc);

        ///Задача 6
        int a = 2;
        int v = ++a + ++a * ++a;
        System.out.println(v);
        ///Задача 7
        System.out.println("Total: "+3 +4);
        ///Задача 8
        System.out.println(12%3);
        ///Задача 9
        System.out.println(13%3);
        ///Задача 10
        System.out.println(Byte.MAX_VALUE);
        ///Задача 11
        System.out.println(Short.SIZE);
        ///Задача 12
        System.out.println(Integer.MIN_VALUE);

        ///Задача 13
        for (int i = 0; i<=10; i++){
            System.out.println(i);
        }

        ///Задача 14
        for(int i = 1; i < 10; i++){
            for(int g = 1; g < 10; g++){
                System.out.print(g * i + "  ");
            }
            System.out.println("");
        }

        ///Задача 15
        int time = 9955;

        System.out.println(time/ + 3600 +"Ч " + (time%3600)/60 + "М " + (time%3600)%60 + "С");
        */
        /// Lession 2
        /// Задача 1
        int plusInt = 10;
        if (plusInt >= 0){
            ++plusInt;
        }
        System.out.println(plusInt);

        /// Задача 1
        int one = 1;
        int two = 2;
        int change = 10;
        int result;
        int randomInt = 0;
        if (randomInt > 0){
            System.out.println(randomInt + one);
        }
        else if (randomInt < 0){
            System.out.println(randomInt - two);
        }
        else if (randomInt == 0){
            System.out.println(randomInt = change);
        }


        int a = 5;
        int b = 5;
        int summ;
        if (a != b){
            summ = a + b;
            a = summ;
            b = summ;
        }
        else if (a == b){
            a = 0;
            b = 0;
        }
        System.out.println(a + " " + b);
    }

    }



