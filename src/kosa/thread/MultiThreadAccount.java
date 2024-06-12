package kosa.thread;

public class MultiThreadAccount {
    public static void main(String[] args) {
        SharedArea area = new SharedArea();

        area.account1 = new Account("111-111-111", 20000000, "이몽룡");
        area.account2 = new Account("222-222-222", 10000000, "성춘향");

        TransferThread thread1 = new TransferThread(area);
        PrintThread thread2 = new PrintThread(area);

        thread1.start();
        thread2.start();
    }
}
