package com.company;

import javax.swing.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;
import java.util.TimeZone;

public class Main {

    public static void main(String[] args) {
        ///Part1
        /*///Задача 1,2
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

        System.out.println(time/ + 3600 +"Ч " + (time%3600)/60 + "М " + (time%3600)%60 + "С");*/

        /// Lession 2
        /// Задача 1
        /*int plusInt = 10;
        if (plusInt >= 0){
            ++plusInt;
        }
        System.out.println(plusInt);

        /// Задача 2
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

        /// Задача 3
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

        /// Задача 4
        int newInt = 55;
        String StrLen;
        StrLen = String.valueOf(newInt);
        int NewSumm = StrLen.length();
        if (newInt%2 == 0 && NewSumm == 3){
            System.out.println(newInt + " - четное трехзначное число");
        }
        else if (newInt%2 != 0 && NewSumm == 3) {
            System.out.println(newInt + " - нечетное трехзначное число");
        }
        else if (newInt%2 == 0 && NewSumm == 2){
            System.out.println(newInt + " - четное двухзначное число");
        }
        else if (newInt%2 != 0 && NewSumm == 2){
            System.out.println(newInt + " - нечетное двухзначное число");
        }
        else if (newInt%2 == 0 && NewSumm == 1){
            System.out.println(newInt + " - четное одинарное число");
        }
        else if (newInt%2 != 0 && NewSumm == 1){
            System.out.println(newInt + " - нечетное одинарное число");
        }


        ///Задача 5

        String text = "В этой4 строке3 четыре4 цифры7";
        int count = text.replaceAll("[^\\d]","").length();
        System.out.println(count);

        ///Задача 6

        String newText = "small text to big text";
        String newBigText = newText.toUpperCase();
        System.out.println(newBigText);

        ///Задача 7
        Scanner inputC = new Scanner(System.in);
        System.out.println("Введите символ");
        String c = inputC.nextLine();
        Scanner inputS = new Scanner(System.in);
        System.out.println("Введите строку");
        String stringS = inputS.nextLine();
        String resultNew = stringS.replaceAll(c, c + c);
        System.out.println(resultNew);


        //--------------

        int [] arrayMain = {};*/

        /*int[] a = new int[100];
        Random r = new Random();
            for (int i = 0; i < a.length; i++)
                a[i] = r.nextInt();
                int sum = 0;

            for (int i = 0; i < a.length; i++){
                if (a[i] > 5) sum += a[i];
            }
        System.out.println("Сумма= " + sum);*/
        //13. 19 21 25 37 38 39 40

        //задача 13
        /*int[] arrF = new int [20];
        for (int i = 0; i < arrF.length; i++){
            if (i < 2){
                arrF[i] = 1;
            }
            else {
                arrF[i] = arrF[i-2] + arrF[i-1];
            }
            System.out.println(arrF[i]);
        }

        //Задача 19
        int strCount = "вася пупкин программист".split(" ").length;
        System.out.println("Слов в строке: " + strCount);

        // задача 21
        String text = "Необходимо, подсчитать, количетво знаков препинани.я вне главной диагонали матрицы.";
        int oldString = text.length();
        int newString = text.replaceAll("[,.]", "").length();
        System.out.println("Количество знаков препинания в тексте: " + (oldString - newString));

        //Задача 25
        int[] arrInt = new int[2];
        arrInt[0] = 13;
        arrInt[1] = 31;
        arrInt[0] = arrInt[0] + arrInt[1] - (arrInt[1] = arrInt[0]);
        System.out.println(arrInt[0] + " " + arrInt[1]); */

        printNoob("Jhon", "programmer", 25);

        Instant previous = Instant.now();
        int i = 0;
        while (i<=5){
            JOptionPane.showInputDialog("What`s your name");
            i++;
        }
        Instant current = Instant.now();
        System.out.println(ChronoUnit.SECONDS.between(previous,current)+ " seconds");

    }

        public static void printNoob (String Name, String job, int age){
            System.out.println("Name = [" + Name + "], job = [" + job + "], age = [" + age + "]");



        }

    }



