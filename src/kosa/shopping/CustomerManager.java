package kosa.shopping;

import java.util.Scanner;
import java.util.regex.Pattern;

public class CustomerManager {
    Scanner sc = new Scanner(System.in);

    void register(Customer customer) {
        System.out.println("-----회원가입-----");

        String id;
        while (true) {
            System.out.print("id를 입력해주세요(이메일 형식): ");
            id = sc.nextLine();
            if (Pattern.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$", id)) {
                break;
            } else {
                System.out.println("올바른 이메일 형식이 아닙니다. 다시 입력해주세요.");
            }
        }

        String pw;
        while (true) {
            System.out.print("비밀번호는 최소 8자 이상, 대문자, 소문자, 숫자, 특수문자를 하나씩 포함해서 입력해주세요: ");
            pw = sc.nextLine();
            if (Pattern.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*()_+=-]).{8,}$", pw)) {
                break;
            } else {
                System.out.println("올바른 비밀번호 형식이 아닙니다. 다시 입력해주세요.");
            }
        }

        String name;
        while (true) {
            System.out.print("이름을 입력해주세요 (한글 또는 영어, 2~15자): ");
            name = sc.nextLine();
            if (Pattern.matches("^[가-힣a-zA-Z]{2,15}$", name)) {
                break;
            } else {
                System.out.println("올바른 이름 형식이 아닙니다. 다시 입력해주세요.");
            }
        }

        System.out.print("주소를 입력해주세요 : ");
        String address = sc.nextLine();

        customer.id = id;
        customer.pwd = pw;
        customer.name = name;
        customer.address = address;
        System.out.println("회원 가입 완료: " + customer.name);
    }

    void placeOrder(Customer customer, Menu[] menuItems) {
        Order order = new Order();
        order.customerId = customer.id;
        order.menuItems = menuItems;
        order.totalPrice = calculateTotalPrice(menuItems);
        customer.orders.add(order);
        System.out.println("주문 완료: " + order);
    }

    int calculateTotalPrice(Menu[] menuItems) {
        int total = 0;
        for (Menu item : menuItems) {
            total += item.price;
        }
        return total;
    }

    void showOrders(Customer customer) {
        for (Order order : customer.orders) {
            System.out.println(order);
        }
    }

    void customerMenu(Customer customer, Owner owner) {
        while (true) {
            System.out.println("\n=== 고객 기능 ===");
            System.out.println("1. 회원가입");
            System.out.println("2. 주문하기");
            System.out.println("3. 주문 내역 보기");
            System.out.println("4. 사장님으로 전환");
            System.out.println("5. 종료");
            System.out.print("선택: ");
            int choice = sc.nextInt();
            sc.nextLine(); // 개행 문자 처리

            switch (choice) {
                case 1:
                    // 회원가입
                    register(customer);
                    break;
                case 2:
                    // 주문하기
                    Menu[] menus = owner.menus;
                    for (int i = 0; i < owner.menuCount; i++) {
                        System.out.println((i + 1) + ". " + menus[i]);
                    }
                    System.out.print("주문할 메뉴를 선택하세요 (번호 입력) :");
                    int menuChoice = sc.nextInt();
                    sc.nextLine();

                    if (menuChoice > 0 && menuChoice <= owner.menuCount) {
                        Menu[] selectedMenus = {menus[menuChoice - 1]};
                        placeOrder(customer, selectedMenus);
                    } else {
                        System.out.println("잘못된 메뉴 선택.");
                    }
                    break;
                case 3:
                    // 주문 내역 보기
                    showOrders(customer);
                    break;
                case 4:
                    // 사장님으로 전환
                    return;
                case 5:
                    // 종료
                    System.out.println("프로그램을 종료합니다.");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("잘못된 선택입니다. 다시 입력해주세요.");
            }
        }
    }
}

