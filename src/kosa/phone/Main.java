package kosa.phone;

import java.io.BufferedReader;
import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        PhoneManager phoneManager = new PhoneManager();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {

            System.out.println("1.추가 2.전체출력 3.검색 4.수정 5.삭제 6.정렬 7.종료");
            System.out.print("번호를 입력해주세요 => ");

            int menu = Integer.parseInt(br.readLine());

            if (menu == 1) {

                System.out.println("추가할 정보를 입력해주세요");

                System.out.print("이름 => ");
                String name = br.readLine();

                String phone;
                while (true) {
                    System.out.print("전화번호 (11자리로 입력해주세요 ex)010XXXXXXXX) => ");
                    phone = br.readLine();
                    if (phone.length() == 11) {
                        break;
                    } else {
                        System.out.println("⚠️전화번호는 11자리로 입력해주세요 ⚠️");
                    }
                }

                String birth;
                while (true) {
                    System.out.print("생일 (8자리로 입력해주세요 ex)20240528) => ");
                    birth = br.readLine();
                    if (birth.length() == 8) {
                        break;
                    } else {
                        System.out.println("⚠️생일은 8자리로 입력해주세요 ⚠️");
                    }
                }

                phoneManager.addPhoneInfo(name, phone, birth);
                System.out.println("===================");

            } else if (menu == 2) {

                phoneManager.listPhoneInfo();
                System.out.println("===================");

            } else if (menu == 3) {
                System.out.print("검색할 전화번호부의 이름을 입력해주세요 =>");
                String name = br.readLine();
                phoneManager.searchPhoneInfo(name);
                System.out.println("===================");
            } else if (menu == 4) {
                System.out.print("수정할 전화번호부의 이름을 입력해주세요 =>");
                String name = br.readLine();
                phoneManager.updatePhoneInfo(name);
                System.out.println("===================");
            } else if (menu == 5) {
                System.out.print("삭제할 전화번호부의 이름을 입력해주세요 =>");
                String name = br.readLine();
                phoneManager.deletePhoneInfo(name);
                System.out.println("===================");
            } else if (menu == 6) {
                System.out.println("정렬 기준");
                System.out.println("1. 이름순 2. 번호순 3. 생일순");
                int num = Integer.parseInt(br.readLine());
                phoneManager.sortPhoneInfo(num);
            } else if (menu == 7) {
                return;
            } else {
                System.out.println("⚠️올바른 번호를 입력해주세요!!⚠️");
                System.out.println("===================");
            }
        }
    }
}