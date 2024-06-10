package kosa.oopLamda;

interface C {
    D abc();
}

class D {
    D() {
        System.out.println("B 생성자");
    }
}

public class Main3 {
    public static void main(String[] args) {
        C c = new C() {
            @Override
            public D abc() {
                return new D();
            }
        };
        c.abc();

        //인스턴스 참조
        C c2 = D::new;
        c2.abc();

    }
}
