import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int tc = Integer.parseInt(br.readLine());
        for (int TC = 1; TC <= tc; TC++) {
            int[][] arr = new int[tc][2];

            // 배열 입력받기
            for (int i = 0; i < arr.length; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                arr[i][0] = Integer.parseInt(st.nextToken());
                arr[i][1] = Integer.parseInt(st.nextToken());

            }

            System.out.println(Arrays.deepToString(arr));

            // 최대 수익 구하기

            int max = 0;
            for (int i = 0; i < arr.length; i++) {


                System.out.println("i = " + i);
                int days = arr[i][0];
                int sum = arr[i][1];

                System.out.println("days = " + days);
                System.out.println("sum = " + sum);

                while (true) {
                    // 수익 구하기
                    if (i + days - 1 >= arr.length) {
                        if (sum > max) max = sum;
                        break;
                    }

                    int nextIndex = i + days - 1;

                    // 다음 상담이 tc 기간을 넘어가면 중단
                    if (nextIndex >= arr.length || nextIndex + arr[nextIndex][0] > tc) {
                        if (sum > max) max = sum;
                        break;
                    }


                    days += arr[days + i - 1][0];
                    sum += arr[days + i - 1][1];
                    System.out.println("days = " + days);
                    System.out.println("sum = " + sum);

                }
            }


            System.out.println("max = " + max);
            System.out.println();

        }


    }
}