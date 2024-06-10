package Kcc_assignment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Mission05 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int tc = Integer.parseInt(br.readLine());

        for (int i = 1; i <= tc; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int hyun = Integer.parseInt(st.nextToken());
            int won = Integer.parseInt(st.nextToken());

            int days = 0;
            // won > hyun
            while(true){
                days++;
                if(won * 3 > hyun * 2) break;
                won *= 3;
                hyun *= 2;
            }

            System.out.println("#" + i +" " + days);
        }
    }
}
