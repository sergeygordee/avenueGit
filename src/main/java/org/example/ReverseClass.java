package org.example;

import java.util.Scanner;

public class ReverseClass {
        public static void main(String args[]) {
            String text = "Я буду учиться лучше";
            String[] parts = text.split(" ");

            for (int i = 0; i < parts.length; i++) {
                System.out.println(parts[i]);
            }
            for (int i = parts.length - 1; i >= 0; i--) {
                System.out.println(parts[i]);
            }
        }
    }

