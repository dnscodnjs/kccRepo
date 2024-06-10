package kosa.Restaurant;

public class Main {
    public static void main(String[] args) {
        Appetizer appetizer1 = new Appetizer("초코", 1000, "달디단 초콜릿", 250);
        MainCourse mainCourse1 = new MainCourse("스테이크", 24000, "한우 ~", false, true);
        Dessert dessert1 = new Dessert("빵", 3500, "빵빵빵", true);

        Order order = new Order();
        order.addItem(appetizer1);
        order.addItem(mainCourse1);
        order.addItem(dessert1);

        order.displayOrder();
        order.checkout();
    }
}
