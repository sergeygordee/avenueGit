package org.example;

import java.util.Scanner;

public class ThirdLesson {
    public static void main(String[] args) {
        /*System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        System.out.println("4");
        System.out.println("5");*/

        /*for (int i = 1; i <= 10; i*=2) {
            System.out.println(i);
            System.out.println("Привет");
        }
        System.out.println("Программа закончила работу");*/

        /*int num1 = 1;
        while (num1 >= 10) {
            System.out.println(num1);
            num1++;
        }
        System.out.println("Программа закончила работу");*/

        /*int num1 = 1;
        do {
            System.out.println(num1);
            num1++;
        }while (num1 >= 10);*/

        /*ввести с консоли два числа, первое - начало, второе - конец, нужно вывести
        все числа от первого введенного до второго введенного, а если это невозможно, вывести строку "Поробуй еще раз!"*/
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("введите первое чисо");
        int num1 = scanner.nextInt();
        System.out.println("введите второе чисо");
        int num2 = scanner.nextInt();
        if (num1 > num2) {
            System.out.println("Попробуй еще раз!");
        } else {
            *//*while (num1 < num2) {
                System.out.println(num1);
                num1++;
            }*//*

         *//*do {
                System.out.println(num1);
                num1++;
            }while (num1 < num2);*//*

         *//*for (int i = num1; i < num2; i++){
                System.out.println(i);
            }*//*
            System.out.println("Программа закончила работу");*/


        int nums[] = new int[5];
        nums[0] = 11;
        nums[1] = 12;
        nums[2] = 13;
        nums[3] = 14;
        nums[4] = 15;
        //System.out.println(nums[1]);

        int nums1[] = new int[]{12, 3423, 65, 4, 65, 8};
        int count = nums1.length;
        //System.out.println(nums1.length);
        //System.out.println(nums1[3]);
        //System.out.println(nums1);

        /*for (int i =0; i <= nums1.length-1; i++){
            System.out.println(nums1[i]);

        }*/

        for (int i : nums1) {
            // System.out.println(i);
        }

        int nums2[] = new int[]{123, 54, -27, 8, 3, -3, -54654, -46};
        /*for (int i =0;i < nums2.length; i++){
            if (nums2[i] > 0) {
                System.out.println("Положительно число " + nums2[i]);
            }
            else {
                System.out.println("Отрицательное число " + nums2[i]);
            }
        }*/
        for (int i :nums2) {
            if (i > 0) {
                System.out.println("Положительно число " + i);
            }
            else {
                System.out.println("Отрицательное число " + i);
            }
        }
        System.out.println("программа закончила работу");

    }


}
