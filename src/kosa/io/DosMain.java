package kosa.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DosMain {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("===미니 도스===");


        String patternString1 = "^cd\\s.+";
        String patternString2 = "^cd\\.\\.$";
        Pattern patternChild = Pattern.compile(patternString1);
        Pattern patternParent = Pattern.compile(patternString2);

        File file = new File("C:\\KCC\\work\\java_work\\Kcc_java\\src\\kosa");

        while (true) {

            System.out.println("현재 경로 : " + file);

            System.out.println("1. ls (파일 목록 출력)");
            System.out.println("2. cd ~~~ (자식 디렉토리 이동)");
            System.out.println("3. cd.. (부모 디렉토리 이동)");
            System.out.println("4. mkdir ~~~ (새로운 디렉토리 생성)");
            System.out.println("5. vi ~~~ (파일 내용 작성)");
            System.out.println("5. 종료");
            System.out.print("입력 ex) ls  : ");
            String input = br.readLine();

            Matcher matcherChild = patternChild.matcher(input);
            Matcher matcherParent = patternParent.matcher(input);


            if (input.equals("ls")) {
                System.out.println("1. 전체 출력 2. 디렉토리만 출력");
                String str = br.readLine();
                if (str.equals("1")) DosManger.showFile(file);
                else DosManger.showDirectory(file);
            } else if (matcherChild.matches()) {
                file = new File(String.valueOf(DosManger.moveChild(file, input)));
            } else if (matcherParent.matches()) {
                file = new File(String.valueOf(DosManger.moveParent(file)));
            }  else if (input.startsWith("mkdir")) {
                DosManger.makeDir(file, input);
            }   else if (input.startsWith("vi")) {
                DosManger.makeFile(file, input);
            } else if (input.equals("종료")) return;

            System.out.println("===============");
        }
    }
}
