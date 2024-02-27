package org.example;

import java.util.Scanner;

public class SecondLesson {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // System.out.println("Введите ваш возраст: ");
        // int num1 = scanner.nextInt();
        // System.out.println("Ваш возраст = " + num1);

        //System.out.println("Введите ваш день рождения");
        //int day = scanner.nextInt();
//
        //System.out.println("Введите ваш месяц рождения");
        //int mounth = scanner.nextInt();
//
        //System.out.println("Введите ваш год рождения");
        //int year = scanner.nextInt();
        //System.out.println(day + "." + mounth + "." + year);

        //System.out.println("Введите ваше имя");
        //String name = scanner.next();
//
        //System.out.println("Введите ваш возраст");
        //int age = scanner.nextInt();
//
        //System.out.println("Ваше имя " + name + " ваш возраст " + age);

        /*System.out.println("Введите первое число: ");
        int num1 = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int num2 = scanner.nextInt();
        double sum = num1 + num2;
        double minus = num1 - num2;
        double mult = num1 * num2;
        double div = num1 % num2;
        System.out.println(sum);
        System.out.println(minus);
        System.out.println(mult);
        System.out.println(div);*/

        /*int num1 = 13;
        if (num1 > 13){
            System.out.println("Число равно 12");
        }
        else if (num1 == 14){
            System.out.println("Число равно 13");
        }
        else if (num1 == 15){
            System.out.println("Число равно 13");
        }
        else{
            System.out.println("Число не равно 12");
        }

        int num2 = 12;

        num2 = num2 + 8;
        num2 +=8;

        num2*=8;
        num2 = num2 * 8;

        num2+=9;
        num2--;*/

        //int num1 = 12;
        //if (num1 > 10 && num1 ==14 ){
        //    System.out.println("Что-то");
        //}
        //else{
        //    System.out.println("Нечто");
        //}

        //int num1 = 12;
        //switch (num1) {
        //    case 10:
        //        System.out.println("10");
        //        num1++;
        //        break;
        //    case 11:
        //        System.out.println("11");
        //        num1++;
        //        break;
        //    case 12:
        //        System.out.println("12");
        //        num1++;
        //        break;
        //    case 13:
        //        System.out.println("13");
        //        num1++;
        //        break;
        //    case 14:
        //        System.out.println("14");
        //        num1++;
        //        break;
//
        //}


        /*
        * С консоли вводится 2  целых числа, проверить, если их сумма больше 20, напечать их сумму
        * если их сумма меньше 20, распечатать их разность
        * иначе распечать строку "Привет!"
        *
        * */
        System.out.println("Введите первое число");
        int num1 = scanner.nextInt();
        System.out.println("Введите второе число");
        int num2 = scanner.nextInt();
        int result = num1 + num2;
        if(result > 20){
            System.out.println(result);
        }
        else if (result < 20){
            System.out.println(num1 - num2);
        }
        else {
            System.out.println("Привет");
        }

    }
}
