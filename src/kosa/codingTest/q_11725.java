package kosa.codingTest;

import java.util.*;
import java.io.*;

public class q_11725 {
    //static int[][] arr;
    static List<List<Integer>> list;
    static boolean[] visited;
    static HashMap<Integer, Integer> hm;
    static int N;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        hm = new HashMap<>();
        N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            list = new ArrayList<>(new ArrayList<>());
        }
        visited = new boolean[N + 1];

        StringTokenizer st;

        for (int i = 0; i < N - 1; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            list.get(a).add(b);
            list.get(b).add(a);
        }

        dfs(1);

        System.out.println(Arrays.asList(list));
    }

    private static void dfs(int i) {
        visited[i] = true;
        for (int j = 1; j <= N; j++) {

        }
    }
}
