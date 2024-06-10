package kosa.shopping;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CustomerManager customerManager = new CustomerManager();
        OwnerManager ownerManager = new OwnerManager();
        Customer customer = new Customer();
        Owner owner = new Owner();
        boolean isOwner = false;

        // 로그인 및 역할 선택 반복
        while (true) {
            System.out.print("사장님입니까? (네/아니요): ");
            String answer = sc.nextLine().trim().toLowerCase();

            if (answer.equals("네")) {
                isOwner = true;
                break;
            } else if (answer.equals("아니요")) {
                isOwner = false;
                break;
            } else {
                System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
            }
        }

        // 고객과 사장님 기능 선택 반복
        while (true) {
            if (isOwner) {
                ownerManager.ownerMenu(owner);
                isOwner = false;  // 사장님 기능 후에 고객으로 전환
            } else {
                customerManager.customerMenu(customer, owner);
                isOwner = true;  // 고객 기능 후에 사장님으로 전환
            }
        }
    }
}
