import java.io.*;
import java.util.*;

public class Main2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()); // 총 상담 일수
        int[][] arr = new int[n][2];

        // 배열 입력받기
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        //System.out.println(Arrays.deepToString(arr));

        // 최대 수익 구하기
        int maxProfit = 0;
        for (int i = 0; i < n; i++) {
            int days = arr[i][0];
            int sum = arr[i][1];

            if (i + days > n) continue;  // 현재 상담이 퇴사 날짜를 넘기면 무시

            int profit = sum;
            int currentDay = i + days;

            while (currentDay < n) {
                if (currentDay + arr[currentDay][0] > n) break; // 다음 상담이 퇴사 날짜를 넘기면 중단

                profit += arr[currentDay][1];
                currentDay += arr[currentDay][0];
            }

            maxProfit = Math.max(maxProfit, profit);
        }

        System.out.println(maxProfit);
    }
}
