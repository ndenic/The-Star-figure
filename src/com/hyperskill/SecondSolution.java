package com.hyperskill;

import java.util.Scanner;

public class SecondSolution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String arr[][] = new String[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || i == n - j - 1 || i == n / 2 || j == n / 2)  {
                    arr[i][j] = "*";
                } else {
                    arr[i][j] = ".";
                }
            }
        }

        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                System.out.print(arr[r][c] + " ");
            }
            System.out.println();
        }
    }


}
