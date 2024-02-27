package org.example;

public class Rhombus {
    /*public static void main(String[] args) {
        int[][] arr = new int[5][5];
        char x = 'x';
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                if (j == 0 && i == 0) {
                    System.out.print("   ");
                } else if (j == 1 && i == 0) {
                    System.out.print("   ");
                } else if (j == 0 && i == 1) {
                    System.out.print("   ");
                } else if (j == 0 && i == 3) {
                    System.out.print("   ");
                } else if (j == 0 && i == 4) {
                    System.out.print("   ");
                } else if (j == 1 && i == 4) {
                    System.out.print("   ");
                } else if (j == 1 && i == 4) {
                    System.out.print("   ");
                } else if (j == 3 && i == 0) {
                    System.out.print("   ");
                } else if (j == 4 && i == 0) {
                    System.out.print("   ");
                } else if (j == 4 && i == 1) {
                    System.out.print("   ");
                } else if (j == 4 && i == 3) {
                    System.out.print("   ");
                } else if (j == 3 && i == 4) {
                    System.out.print("   ");
                } else if (j == 4 && i == 4) {
                    System.out.print("   ");
                } else {
                    System.out.print(" x ");
                }
            }
            System.out.println("   ");
        }
    }*/

    public static void main(String[] args) {
        int n = 2;
        for (int i = -n; i <= n; i++) {
            for (int j = -n; j <= n; j++) {
                // грань ромба
                int edge = Math.abs(i) + Math.abs(j);
                // форма ромба с цифрами
                if (edge == n)
                    System.out.print("x");
                    // за гранью && в шахматном порядке
                else if (edge > n && (i + j) % 2 != 0
                        // || горизонтальные границы || вертикальные границы
                        || Math.abs(i) == n || Math.abs(j) == n)
                    System.out.print(" ");
                    // пустая часть
                else System.out.print("x");
                // отступ
                System.out.print(" ");
            }
            System.out.println();
        }
    }

}
