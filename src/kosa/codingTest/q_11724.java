package kosa.codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q_11724 {
    static int[][] arr;
    static boolean[] visited;
    static int cnt;
    static int N, M;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[N + 1][N + 1];
        visited = new boolean[N + 1];

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            arr[a][b] = arr[b][a] = 1;
        }

        for (int i = 1; i <= N; i++) {
            if (!visited[i]) {
                System.out.println("i : " + i + "last");
                dfs(i);

                cnt++;
            }
        }

        System.out.println("cnt = " + cnt);
    }

    private static void dfs(int i) {
        visited[i] = true;

        for (int j = 1; j <= N; j++) {
            if (!visited[j] && arr[i][j] == 1) {
                System.out.println("i : " + i + " j : " + j);
                dfs(j);
            }
        }
    }
}


