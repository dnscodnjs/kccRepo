package kosa.order;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Menu menu = new Menu();
        Owner owner = new Owner(menu);
        Customer customer = new Customer();

        while (true) {
            System.out.print("사장님이면 1, 고객이면 2 를 입력하세요: ");
            int now = Integer.parseInt(in.nextLine());

            if (now == 1) {
                while (true) {
                    System.out.println("1. 메뉴 추가 2. 오늘 판매한 가격 확인 3. 손님으로 전환 4. 종료");
                    System.out.print("입력 => ");
                    int n = Integer.parseInt(in.nextLine());

                    if (n == 1) {
                        owner.addMenu(); // 메뉴 추가
                    } else if (n == 2) {
                        System.out.println("오늘 판매한 금액: " + owner.getBalance() + "원"); // Owner 클래스의 최종 잔액 확인
                    } else if (n == 3) {
                        break; // 다시 사장님, 손님 할지 입력 받기
                    } else if (n == 4) {
                        return; // 종료
                    }
                }
            } else if (now == 2) {
                while (true) {
                    System.out.println("1. 메뉴 보기 2. 잔액 추가 3. 주문 하기 4. 주문한 메뉴 확인 5. 사장님으로 전환 6. 종료");
                    System.out.print("입력 => ");
                    int n = Integer.parseInt(in.nextLine());

                    if (n == 1) {
                        // 메뉴 보기
                        owner.showMenu();
                    } else if (n == 2) {
                        customer.addCustom();
                    } else if (n == 3) {
                        // 메뉴 주문
                        owner.showMenu();
                        System.out.print("주문할 메뉴 번호를 입력하세요: ");

                        int menuIndex = Integer.parseInt(in.nextLine()) - 1;

                        Menu[] menus = owner.getMenuList();

                        if (menuIndex >= 0 ) {
                            customer.order(menus[menuIndex], owner);
                        } else {
                            System.out.println("잘못된 메뉴 번호입니다.");
                        }

                    } else if (n == 4) {
                        // 주문한 메뉴 확인
                        customer.showReceipts();
                    } else if (n == 5) {
                        break;
                    } else if (n == 6) {
                        return;
                    }
                }
            } else {
                System.out.println("잘못 입력했습니다! 다시 입력하세요");
            }
        }
    }
}
