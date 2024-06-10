package kosa.bank;

public class Account {
    private String id;
    private long balance;

    public Account(){}

    public Account(String id, long balance){
        this.id = id;
        this.balance = balance;
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
