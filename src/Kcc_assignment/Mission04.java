package Kcc_assignment;

import java.io.*;
import java.util.*;

public class Mission04 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][n];

        for (int i = 0; i < arr.length; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int max = 0;
        int sum = 0;
        // 가로, 세로 최대합
        for (int i = 0; i < arr.length; i++) {
            sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
            if (sum > max) max = sum;

            sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[j][i];
            }
            if (sum > max) max = sum;
        }

        // 대각선 우하향
        sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][i];
        }

        // 대각선 좌하향
        sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][arr.length - i - 1];
        }
        if (sum > max) max = sum;

        System.out.println("최댓값 : " + max);
    }
}
