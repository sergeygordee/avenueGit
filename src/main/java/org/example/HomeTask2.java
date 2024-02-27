package org.example;

import java.util.Scanner;
public class HomeTask2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первую сторону треугольника: ");
        int num1 = scanner.nextInt();
        System.out.println("Введите вторую сторону треугольника: ");
        int num2 = scanner.nextInt();
        System.out.println("Введите третью сторону треугольника: ");
        int num3 = scanner.nextInt();

        if (num1 == num2 && num1 == num3 && num2 == num3) {
            System.out.println("Треугольник равносторонний");
        } else if (num1 == num2 || num1 == num3 || num2 == num3) {
            System.out.println("Треугольник равнобедренный");
        } else if (num1 != num2 && num1 != num3 && num2 != num3) {
            System.out.println("Треугольник разносторонний");
        }
        else System.out.println("Треугольник равнобедренный или равносторонний или равнобедренный");



    }


}
