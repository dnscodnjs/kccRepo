package kosa.oopLamda;

interface A {
    void abc();
}

class B {
    void vcd(){
        System.out.println("메서드 호출");
    }
}

public class Main2 {
    public static void main(String[] args) {
        // 기본 익명내부 클래스 구현
        A a = new A() {
            @Override
            public void abc() {
                B b = new B();
                b.vcd();
            }
        };
        a.abc();

        // 람다 1차
        A a2 = () -> new B().vcd();

        a2.abc();

        // 인스턴스 참조
        A a3 = new B()::vcd;
        a3.abc();

    }
}
