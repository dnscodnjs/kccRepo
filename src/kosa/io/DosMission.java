package kosa.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class DosMission {
    static File file;
    public static void printAllFiles(File file) {
        if (file.isDirectory()) {
            File[] fileList = file.listFiles();
            for (File f : fileList) {
                if (f.isDirectory()) {
                    System.out.println("======================");
                    System.out.println("**" + f.getName() + "**");
                    printAllFiles(f);
                    System.out.println("======================");
                } else {
                    System.out.println();
                    System.out.println(f.getName());
                }
            }
        }
    }

    public static void moveChild(File file, String menu) {

        if(file.isDirectory()) {
            for(File f : file.listFiles()) {
                if(menu.equals("cd " +f.getName())) {
                    DosMission.file = new File(String.valueOf(f));
                    System.out.println(f);
                }else {

                }
            }
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String path = "C:\\KCC\\work\\java_work\\Kcc_java\\src\\kosa";
        file = new File(path);
        while (true) {
            System.out.print("입력>");
            String menu = br.readLine();
            if(menu.equals("ls")) {
                printAllFiles(file);
            } else if(menu.startsWith("cd ")) {
                moveChild(file,menu);
            } else if(menu.matches("cd"+"..")) {
                path = file.getParent();
                System.out.println(file.getParent());
                DosMission.file = new File(path);
            }

            else if(menu.equals("q")) {
                System.out.println("종료");
                return;
            }
        }

    }
}
