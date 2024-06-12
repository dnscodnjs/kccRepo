package kosa.phone;

import java.io.BufferedReader;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        PhoneManager phoneManager = new PhoneManager();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {

            System.out.println("1.추가 2.전체출력 3.검색 4.수정 5.삭제 6.정렬 7. 데이터 저장 8. 데이터 불러오기 9.종료");
            System.out.print("번호를 입력해주세요 => ");

            int menu = Integer.parseInt(br.readLine());

            if (menu == 1) {
                System.out.println("추가할 정보를 입력해주세요");
                System.out.println("1. 회사 정보 추가");
                System.out.println("2. 대학 정보 추가");
                System.out.print("번호를 입력해주세요 => ");
                int addMenu = Integer.parseInt(br.readLine());

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

                if (addMenu == 1) {
                    System.out.print("부서 => ");
                    String dept = br.readLine();
                    System.out.print("직책 => ");
                    String position = br.readLine();
                    phoneManager.addPhoneInfo(new Company(name, phone, birth, dept, position));
                } else if (addMenu == 2) {
                    System.out.print("전공 => ");
                    String major = br.readLine();
                    System.out.print("학번 => ");
                    String year = br.readLine();
                    phoneManager.addPhoneInfo(new Universe(name, phone, birth, major, year));
                } else {
                    System.out.println("⚠️올바른 번호를 입력해주세요!!⚠️");
                }
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
                phoneManager.outputFile();
            } else if (menu == 8) {
                phoneManager.inputFile();
            } else if (menu == 9) {
                return;
            } else {
                System.out.println("⚠️올바른 번호를 입력해주세요!!⚠️");
                System.out.println("===================");
            }
        }
    }
}
