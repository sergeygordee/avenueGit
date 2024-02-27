package org.example;

import java.util.Scanner;

public class HomeTask567 {
    public static void main(String[] args) {
        String method[][] = new String[8][8];

        for (int i = 0; i < method.length; i++) {
            for (int j = 0; j < method.length; j++) {

                if ((i + j) % 2 == 0) {
                    method[i][j] = "X";
                    System.out.print(method[i][j]);
                }
                System.out.println();
                //else if ( ((i + j) % 2 != 0))method[i][j] = "O";
            }
        }
    }
}

