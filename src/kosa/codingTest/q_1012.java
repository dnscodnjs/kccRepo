package kosa.codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class q_1012 {
    public static int cnt;
    static int num;
    static int[][] arr;
    static int x, y;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static boolean[][] visited;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int tc = Integer.parseInt(br.readLine());

        for (int TC = 1; TC <= tc; TC++) {
            cnt = 0;

            StringTokenizer st = new StringTokenizer(br.readLine());
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());
            arr = new int[x][y];
            visited = new boolean[x][y];

            int num = Integer.parseInt(st.nextToken());

            for (int i = 0; i < num; i++) {
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());

                arr[a][b] = 1;
            }

            for (int i = 0; i < x; i++) {
                for (int j = 0; j < y; j++) {
                    if (arr[i][j] == 1 && !visited[i][j]) {
                        dfs(i, j);
                        cnt++;
                    }
                }
            }

/*            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }*/

            System.out.println(cnt);

        }
    }

    private static void dfs(int i, int j) {
        visited[i][j] = true;

        for (int k = 0; k < 4; k++) {
            int nowx = i + dx[k];
            int nowy = j + dy[k];

            if (nowx >= 0 && nowx < x && nowy >= 0 && nowy < y) {
                if (!visited[nowx][nowy] && arr[nowx][nowy] == 1) {
                    dfs(nowx, nowy);
                }
            }
        }
    }
}
