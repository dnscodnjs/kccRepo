package kosa.order;

import java.util.Scanner;

public class Menu {
    private String name;
    private int price;
    private Scanner sc;
    private Menu[] menuList;
    private int count;

    public Menu() {
        sc = new Scanner(System.in);
        menuList = new Menu[10];
    }

    public void addMenu() {
        System.out.println("메뉴를 입력하세요 !!");
        System.out.print("메뉴의 이름 : ");
        String name = sc.nextLine();
        System.out.print("메뉴의 가격 : ");
        int price = Integer.parseInt(sc.nextLine());

        Menu menu = new Menu();
        menu.setName(name);
        menu.setPrice(price);

        menuList[count++] = menu;
        System.out.println("메뉴가 추가되었습니다!!");
    }

    public void show() {
        System.out.println("=== 메뉴 목록 ===");
        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + " 번 메뉴 :  " + menuList[i].getName() + " - " + menuList[i].getPrice() + "원");
        }
    }

    public Menu[] getMenuList() {
        return this.menuList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
