package kosa.thread;

public class MultiThreadExample {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new DigitThread();
        thread.start();
        Thread.sleep(1000);
        for (char ch = 'A'; ch <= 'Z' ; ch++) {
            System.out.println("ch = " + ch);
        }
    }
}
