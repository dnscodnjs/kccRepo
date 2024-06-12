package kosa.thread;

public class SumThread extends Thread{
    private int start;
    private int end;
    int sum = 0;

    public SumThread(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        for (int i = start; i <= end; i++) {
            sum += i;
        }
//        System.out.println(sum);
    }

    public int getSum() {
        return sum;
    }
}
