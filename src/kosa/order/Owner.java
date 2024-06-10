package kosa.order;

public class Owner {

    private int balance;
    private Menu menu;

    public Owner(){}

    public Owner(Menu menu) {
        this.menu = menu;
        this.balance = 0;
    }

    public void addBalance(int amount) {
        balance += amount;
    }

    public void addMenu() {
        menu.addMenu();
    }

    public Menu[] getMenuList() {
        return menu.getMenuList();
    }

    public int getBalance() {
        return balance;
    }

    public void showMenu() {
        menu.show();
    }

}
