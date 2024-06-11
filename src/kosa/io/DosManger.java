package kosa.io;

import java.io.*;

public class DosManger {
    static int cnt = 1;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void showFile(File file) {
        if (file.isDirectory()) {
            System.out.println();

            System.out.println(file.getName() + "의 디렉토리");
            cnt = 1;

            for (File f : file.listFiles()) {
                showFile(f);
            }
        } else {
            System.out.println(cnt++ + "번 째 파일 : " + file);
        }
    }

    public static void showDirectory(File file) {
        if (file.isDirectory()) {
            System.out.println();

            System.out.println(file.getName() + "의 디렉토리");
            cnt = 1;

            for (File f : file.listFiles()) {
                showDirectory(f);
            }
        }
    }

    public static File moveChild(File file, String input) {
        String stop = input.substring(3);

        File move = new File(buildDir(file, stop));

        if (move.exists()) {
            System.out.println("이동된 경로 : " + move);
            return move;
        } else {
            System.out.println("존재하지 않는 디렉토리입니다.");
            return file;
        }
    }
    public static File moveParent(File file) {
        File move = file.getParentFile();

        return move;
    }

    public static void makeDir(File file, String input) {
        String stop = input.substring(6);

        File mkdir = new File(buildDir(file, stop));
        mkdir.mkdirs();
    }

    public static void makeFile(File file, String input) throws IOException {

        String stop = input.substring(3);

        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(buildDir(file, stop));

            System.out.print("내용 입력 (q 누르면 종료) : ");
            StringBuilder sb = new StringBuilder();
            while (true) {
                String str = br.readLine();
                if (str.equals("q")) break;
                sb.append(str).append("\n");
            }
            fileWriter.write(sb.toString());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                fileWriter.close();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    private static String buildDir(File file, String stop) {
        StringBuilder sb = new StringBuilder();

        sb.append(file.toString()).append("\\").append(stop);

        return sb.toString();
    }

}
