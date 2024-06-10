package kosa.shopping;

import java.util.*;

public class OwnerManager {
    Scanner sc = new Scanner(System.in);

    void registerMenu(Owner owner, String name, int price, Category category) {
        if (owner.menuCount < owner.menus.length) {
            Menu menu = new Menu();
            menu.name = name;
            menu.price = price;
            menu.category = category;
            owner.menus[owner.menuCount++] = menu;
            System.out.println("메뉴 등록 완료: " + menu);
        } else {
            System.out.println("메뉴가 가득 찼습니다!");
        }
    }

    void displayMenusByCategory(Owner owner, Category category) {
        for (Menu menu : owner.menus) {
            if (menu != null && menu.category == category) {
                System.out.println(menu);
            }
        }
    }

    void sortMenusByName(Owner owner) {
        List<Menu> menus = new ArrayList<>();
        // 이름순으로 메뉴 정렬 로직
        for (Menu menu : owner.menus) {
            if (menu != null) menus.add(menu);
        }

        Collections.sort(menus, new Comparator<Menu>() {
            @Override
            public int compare(Menu o1, Menu o2) {
                return o1.name.compareTo(o2.name);
            }
        });

        for (Menu menu : menus){
            System.out.println(menu.toString());
        }
    }


    private void sortMenusByPrice(Owner owner) {

        List<Menu> menus = new ArrayList<>();
        // 이름순으로 메뉴 정렬 로직
        for (Menu menu : owner.menus) {
            if (menu != null) menus.add(menu);
        }

        Collections.sort(menus, new Comparator<Menu>() {
            @Override
            public int compare(Menu o1, Menu o2) {
                return o1.price - o2.price;
            }
        });


        for (Menu menu : menus){
            System.out.println(menu.toString());
        }

    }

    void displayMenus(Owner owner) {
        for (Menu menu : owner.menus) {
            if (menu != null) {
                System.out.println(menu);
            }
        }
    }

    void ownerMenu(Owner owner) {
        while (true) {
            System.out.println("\n=== 사장님 기능 ===");
            System.out.println("1. 메뉴 등록");
            System.out.println("2. 카테고리 별로 메뉴 보기");
            System.out.println("3. 메뉴 정렬하기");
            System.out.println("4. 전체 메뉴 보기");
            System.out.println("5. 고객으로 전환");
            System.out.println("6. 종료");
            System.out.print("선택: ");
            int choice = sc.nextInt();
            sc.nextLine(); // 개행 문자 처리

            switch (choice) {
                case 1:
                    // 메뉴 등록
                    System.out.println("카테고리를 선택하세요:");
                    Category[] categories = Category.getCategories();
                    for (int i = 0; i < categories.length; i++) {
                        System.out.println((i + 1) + ". " + categories[i].getDisplayName());
                    }
                    int categoryChoice = sc.nextInt();
                    sc.nextLine(); // 개행 문자 처리

                    System.out.print("메뉴 이름 입력: ");
                    String menuName = sc.nextLine();
                    System.out.print("메뉴 가격 입력: ");
                    int menuPrice = sc.nextInt();
                    sc.nextLine(); // 개행 문자 처리

                    if (categoryChoice > 0 && categoryChoice <= categories.length) {
                        Category category = categories[categoryChoice - 1];
                        registerMenu(owner, menuName, menuPrice, category);
                    } else {
                        System.out.println("잘못된 카테고리 선택.");
                    }
                    break;
                case 2:
                    // 카테고리 별로 메뉴 보기
                    System.out.println("카테고리를 선택하세요:");
                    Category[] categoriesForOwner = Category.getCategories();
                    for (int i = 0; i < categoriesForOwner.length; i++) {
                        System.out.println((i + 1) + ". " + categoriesForOwner[i].getDisplayName());
                    }
                    int categoryChoiceForOwner = sc.nextInt();
                    sc.nextLine(); // 개행 문자 처리

                    if (categoryChoiceForOwner > 0 && categoryChoiceForOwner <= categoriesForOwner.length) {
                        Category category = categoriesForOwner[categoryChoiceForOwner - 1];
                        System.out.println("카테고리: " + category.getDisplayName() + "의 메뉴들:");
                        displayMenusByCategory(owner, category);
                    } else {
                        System.out.println("잘못된 카테고리 선택.");
                    }
                    break;
                case 3:
                    // 메뉴 정렬하기
                    System.out.println("메뉴를 어떤 기준으로 정렬하시겠습니까?");
                    System.out.println("1. 이름순, 2. 가격순");
                    System.out.print("선택: ");
                    int sortChoice = sc.nextInt();
                    sc.nextLine(); // 개행 문자 처리

                    if (sortChoice == 1) {
                        sortMenusByName(owner);
                    } else if (sortChoice == 2) {
                        sortMenusByPrice(owner);
                    } else {
                        System.out.println("잘못된 선택입니다.");
                    }
                    break;
                case 4:
                    // 전체 메뉴 보기
                    displayMenus(owner);
                    break;
                case 5:
                    // 고객으로 전환
                    return;
                case 6:
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
