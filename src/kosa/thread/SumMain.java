package kosa.thread;

public class SumMain {
    public static void main(String[] args) {
        // t1 : 1~50 합 구하기, t2 : 51-100 합 구하기
        // main : t1 + t2 합 => 문제 : join()으로 풀기
        Thread t1 = new SumThread(1, 50);
        Thread t2 = new SumThread(51, 100);
        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(((SumThread) t1).getSum() +((SumThread) t2).getSum()) ;
    }
}
