package Kcc_assignment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Mission01 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        // 1-1
        int num = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }

        System.out.println("-----------------");

        // 1-2
        num = 1;
        int[][] res = new int[n][n];

        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j < n; j++) {
                res[i][j] = num++;
            }
        }

        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[i].length; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }

        // 1-3
        System.out.println("-----------------");

        num = -1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                num += 2;
                System.out.print(num + " ");
            }
            System.out.println();
        }

        // 1-4
        System.out.println("-----------------");

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        // 1-5
        System.out.println("-----------------");

        num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i + 1; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }

        // 1-6
        System.out.println("-----------------");

        for (int i = 0; i < n; i++) {
            num = 1;
            for (int j = n - i; j > 0; j--) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }

        // 1-7
        System.out.println("-----------------");

        num = 1;
        for (int i = 0; i < n; i++) {
            for (int j = n - i; j > 0; j--) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }


        // 1-8
        System.out.println("-----------------");

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(i + j + " ");
            }
            System.out.println();
        }

        // 1-9
        System.out.println("-----------------");

        num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = n - i; j >= 0; j--) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }

        System.out.println("-----------------");
    }
}