package Kcc_assignment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Mission02 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        // 2-1
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print('*' + " ");
            }
            System.out.println();
        }

        System.out.println("-----------------");

        // 2-2
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print('*' + " ");
            }
            System.out.println();
        }

        System.out.println("-----------------");

        // 2-3

        for (int i = 1; i <= n; i++) {
            for (int j = n - i; j >= 0; j--) {
                System.out.print(" " + " ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " ");
            }

            System.out.println();
        }

        System.out.println("-----------------");

        for (int i = 1; i <= n; i++) {
            for (int j = n - i; j >= 0; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " ");
            }

            System.out.println();
        }

        // 2-4
        System.out.println("-----------------");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // 2-5
        System.out.println("-----------------");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }


        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j < n - i; j++)
                System.out.print("  ");
            for (int j = 0; j < i * 2 - 1; j++)
                System.out.print("* ");
            System.out.println();
        }

        //2-6
        System.out.println("-----------------");
        for (int i = 0; i < n; i++) {
            // 첫 번째 다이아몬드
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("  "); // 좌측 공백
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("* ");
            }

            // 첫 번째 다이아몬드와 두 번째 다이아몬드 사이의 공백
            for (int j = 0; j < n; j++) {
                System.out.print("  ");
            }

            // 두 번째 다이아몬드
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("  "); // 좌측 공백
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        // 아랫부분
        for (int i = n - 1; i >= 0; i--) {
            // 첫 번째 다이아몬드
            for (int j = 0; j < n - i; j++) {
                System.out.print("  "); // 좌측 공백
            }
            for (int j = 0; j < i * 2 - 1; j++) {
                System.out.print("* ");
            }

            // 첫 번째 다이아몬드와 두 번째 다이아몬드 사이의 공백
            for (int j = 0; j < n; j++) {
                System.out.print("  ");
            }

            // 두 번째 다이아몬드
            for (int j = 0; j < n - i; j++) {
                System.out.print("  "); // 좌측 공백
            }
            for (int j = 0; j < i * 2 - 1; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }


        // 2-9
        System.out.println("-----------------");
        System.out.println("n = " + n);


    }
}