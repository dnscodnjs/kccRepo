package kosa.codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class q_1302 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int tc = Integer.parseInt(br.readLine());
        HashMap<String, Integer> hm = new HashMap<>();

        int max = 0;
        for (int i = 0; i < tc; i++) {
            String str = br.readLine();
            if (hm.containsKey(str)) {
                hm.put(str, hm.get(str) + 1);
            } else {
                hm.put(str, 1);
            }

            max = Math.max(max, hm.get(str));
        }

        System.out.println(max);

        List<String> arr = new ArrayList<>();



    }
}
