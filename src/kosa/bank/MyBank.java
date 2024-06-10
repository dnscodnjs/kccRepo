package kosa.bank;

public class MyBank {
    private Customer[] customers;
    private Customer[] nowCustomers;
    private int count;

    public MyBank() {
        customers = new Customer[10];
    }

    public void addCustomer(String id, String name, long balance) {
        customers[count++] = new Customer(id, name, balance);
    }

    public Customer getCustomer(String id) {
        int idx = 0;
        for (int i = 0; i < count; i++) {
            if (customers[i].getId().equals(id)) {
                idx = i;
            }
        }
        return customers[idx];
    }

    public Customer[] getAllCustomers() {

        nowCustomers = new Customer[count];

        for (int i = 0; i < count; i++) {
            nowCustomers[i] = customers[i];
        }
        return nowCustomers;
    }
}
