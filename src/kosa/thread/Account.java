package kosa.thread;

public class Account {
    private String id;
    private long balance;
    private String name;

    public Account() {
    }

    public Account(String id, long balance, String name) {
        this.id = id;
        this.balance = balance;
        this.name = name;
    }

    public long getBalance() {
        return balance;
    }

    public boolean withdraw(long balance) {
        boolean flag = false;
        if(balance <= this.balance){
            flag = true;
            this.balance -= balance;
        }
        return flag;
    }

    public void deposit(int balance) {
        this.balance += balance;
    }

    // 입금
    public void plus(long balance) {
        this.balance += balance;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

}
