package kosa.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyExam {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = null;


        try {
            fileWriter = new FileWriter("poem3.txt");

            StringBuilder sb = new StringBuilder();
            FileReader temp = new FileReader("poem2.txt");

            while (true) {
                int data = temp.read();
                sb.append((char) data);
                if (data == -1) break;
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
