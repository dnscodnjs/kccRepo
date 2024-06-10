package kosa.Inheritance;

public class CheckingAccount extends Account{
    private String cardNo;

    public CheckingAccount(){}

    public CheckingAccount(String accountNo, String ownerName, int balance, String cardNo) {
        super(accountNo, ownerName, balance);
        this.cardNo = cardNo;
    }

    public int pay(String cardNo, int amount) throws Exception {
        if((!cardNo.equals(this.cardNo) )|| (getBalance() < amount)){
            throw new Exception("결재불능");
        }

        return withdraw(amount);
    }
}
