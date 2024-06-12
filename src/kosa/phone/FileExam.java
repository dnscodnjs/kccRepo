package kosa.phone;

import java.io.File;

public class FileExam {

    public static void main(String[] args) {
        String path = "C:\\Users\\KOSA\\IdeaProjects\\Study\\src\\kosa";

        File f = new File(path);
        //재귀함수 호출
        callFile(f);

    }

    public static void callFile(File f) {
        if (f.isDirectory()) {
            System.out.println(f.getName() + "의 디렉토리");
            for (File file : f.listFiles()){
                callFile(file);
            }
        } else{
            System.out.println("   " + f.getName() + "이름의 파일");
        }

    }
}
