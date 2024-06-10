package kosa.oopThread;

public class MyThread implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
            }catch (Exception e){
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        MyThread thread = new MyThread();
        Thread thread1 = new Thread(thread);

        thread1.start();
    }
}
