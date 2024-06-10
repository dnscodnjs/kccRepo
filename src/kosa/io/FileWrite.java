package kosa.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.Arrays;

public class FileWrite {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        FileWriter fileWriter = null;

        try {
            fileWriter = new FileWriter("poem2.txt", true);

            System.out.print("입력 (q 누르면 끝) : ");
            StringBuilder sb = new StringBuilder();
            while (true) {
                String str = br.readLine();
                sb.append(str).append("\n");
                if (str.equals("q")) break;
            }
            fileWriter.write(sb.toString());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                fileWriter.close();
            } catch (Exception e2) {

            }
        }
    }
}
