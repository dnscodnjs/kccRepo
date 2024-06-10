package kosa.api;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class String1_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine().toLowerCase();
        String type = br.readLine().toLowerCase();

        int cnt = 0;
        if (str.contains(type)) {
            for (int i = 0; i < str.length(); i++) {
                if (String.valueOf(str.charAt(i)).equals(type)) {
                    cnt++;
                }
            }
        }

        // 1-5
        System.out.println("cnt = " + cnt);

        String[] sentence = br.readLine().split(" ");
        System.out.println(Arrays.toString(sentence));
        String max = "";
        for (int i = 0; i < sentence.length; i++) {
            if (sentence[i].length() > max.length()) {
                max = sentence[i];
            }
        }
        System.out.println("max = " + max);
        StringBuilder sb = new StringBuilder();
        // 1-9
        String str3 = br.readLine();
        for (int i = 0; i < str3.length(); i++) {
            if (str3.charAt(i) -'0' <= 10){
                sb.append(str3.charAt(i));
            }
        }
        System.out.println(sb);

    }
}
