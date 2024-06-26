package kosa.codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class q_5597 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[28];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        if(arr[0] != 1) System.out.println(1);
        if(arr[27] != 30) System.out.println(30);

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - arr[i - 1] != 1) {
                System.out.println(arr[i] - 1);
            }
        }
    }
}
