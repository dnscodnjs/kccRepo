package Kcc_assignment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Mission03 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("몇 명의 성적을 입력하시나요 ? > ");
        int n = Integer.parseInt(br.readLine());
        int[][] score = new int[n][5];

        for (int i = 0; i < score.length; i++) {
            System.out.print("국어, 영어, 수학 점수 입력 : ");
            StringTokenizer st = new StringTokenizer(br.readLine());

            int sum = 0;
            for (int j = 0; j < 3; j++) {
                score[i][j] = Integer.parseInt(st.nextToken());
                sum += score[i][j];
            }

            score[i][3] = sum;
            score[i][4] = sum / 3;

        }

        int[] sumAll = new int[3];
        int[] avgAll = new int[3];

        for (int i = 0; i < n; i++) {
            sumAll[0] += score[i][0];
            sumAll[1] += score[i][1];
            sumAll[2] += score[i][2];
        }

        for (int i = 0; i < avgAll.length; i++) {
            avgAll[i] = sumAll[i] / n;
        }

        System.out.println("국어\t"+"영어\t"+"수학\t"+"총점\t"+"평균\t");
//        System.out.println(Arrays.deepToString(score) + "\t");

        for (int i = 0; i < score.length; i++) {
            System.out.println(Arrays.toString(score[i]) + "\t");
        }

        System.out.println("--------------------");

        System.out.println("각 점수에 대한 평균, 총점");
        System.out.println("국어\t"+"영어\t"+"수학\t");
        System.out.println(Arrays.toString(sumAll) + "\t");
        System.out.println(Arrays.toString(avgAll) + "\t");



    }

}
