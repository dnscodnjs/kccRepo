package kosa.oop;

public class StaticExam {
    int total;
    static int grandTotal;

    private static void add() {
        grandTotal += 10;
    }

    public static void main(String[] args) {
        // 여기서 total을 초기화하면 안되는 이유
        add();
    }
}

