package kosa.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class BufferExam {
    public static void main(String[] args) {
        // 키보드에 연결된 값이 읽어드림
        BufferedReader br = null;
        BufferedWriter bw = null;
        try {

             br = new BufferedReader(new InputStreamReader(System.in));
             bw = new BufferedWriter(new FileWriter("output.txt"));

            System.out.print("입력 : ");
            StringBuilder sb = new StringBuilder();
            while (true){
                String str = br.readLine();
                if(str.equals("q")) break;
                sb.append(str).append("\n");
            }
            bw.write(sb.toString());
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                br.close();
                bw.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }


    }
}
