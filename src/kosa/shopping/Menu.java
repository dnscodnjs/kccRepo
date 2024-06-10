package kosa.shopping;

public class Menu {
    String name;
    int price;
    Category category;

    public String toString() {
        return "이름: " + name + ", 가격: " + price + ", 카테고리: " + category.getDisplayName();
    }

}
