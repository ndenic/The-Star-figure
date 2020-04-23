package com.hyperskill;

import java.util.Scanner;

public class FirstSolution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        String[][] matrix = new String[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = ".";
            }
        }

        for (int i = 0, j = 0; i < n; i++, j++) {
            matrix[i][j] = "*";
        }

        for (int i = 0, j = n - 1; i < n; i++, j--) {
            matrix[i][j] = "*";
        }

        for (int i = 0, j = n / 2; i < n; i++) {
            matrix[i][j] = "*";
        }

        for (int i = n / 2, j = 0; j < n; j++) {
            matrix[i][j] = "*";
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
