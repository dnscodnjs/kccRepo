package kosa.Inheritance;

public class Account {
    // 계좌 객체 생성을 위한 클래스
    // 상태 ( 데이터 ) : 계좌번호, 계좌주, 잔액 => 멤버변수
    // 행동( 기능 ) : 입금, 출금 => 멤버 메서드

    String accountNo;
    String ownerName;
    int balance;

    // 디폴트 생성자
    public Account() {}

    // 생성자
    public Account(String accountNo, String ownerName, int balance) {
        this.accountNo = accountNo;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    // 입금
    public void deposit(int amount) {
        balance += amount;
    }

    // 출금
    public int withdraw(int amount) throws Exception {
        if (balance < amount) {

            throw new Exception("잔액 부족이요 ~");
        }
        balance -= amount;

        return balance;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
