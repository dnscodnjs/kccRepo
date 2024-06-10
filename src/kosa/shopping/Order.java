package kosa.shopping;

public class Order {
    String customerId;
    Menu[] menuItems;
    int totalPrice;

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("고객 ID: ").append(customerId).append(", 가격: ").append(totalPrice).append("\n");
        sb.append("주문한 메뉴:\n");
        for (Menu menu : menuItems) {
            sb.append("- ").append(menu.name).append("\n");
        }
        return sb.toString();
    }
}
