package kosa.Inheritance;

public class MinusAccount extends Account {
    private int creditLine; // 마이너스 한도

    public MinusAccount() {
    }

    public MinusAccount(String accountNo, String ownerName, int balance, int creditLine) {
        super(accountNo, ownerName, balance);
        this.creditLine = creditLine;
    }

    // 메서드 오버라이딩
    // 상속관계
    // 메서드의 시그니처(접근제어자, 리턴형, 이름, 파라미터) 일ㅊ
    // 메서드의 내용 불일치


    @Override
    public int withdraw(int amount) throws Exception {
        if (getBalance() + creditLine < amount) {
            throw new Exception("잔액부족");
        }

        return getBalance() - amount;
    }
}
