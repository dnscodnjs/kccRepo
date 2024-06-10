package kosa.Restaurant;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<MenuItem> items;

    public Order() {
        this.items = new ArrayList<>();
    }

    public void addItem(MenuItem item) {
        items.add(item);
    }

    public void removeItem(MenuItem item) {
        items.remove(item);
    }

    public double calculateTotal() {
        double total = 0;
        for (MenuItem item : items) {
            total += item.getPrice();
        }
        return total;
    }

    public void displayOrder() {
        for (MenuItem item : items) {
            System.out.println(item);
        }
        System.out.println("전체금액: " + calculateTotal());
    }

    public void checkout() {
        displayOrder();
        items.clear();
        System.out.println("주문 완료되었습니다.");
    }
}
