package kosa.oopLamda;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //MyType => 익명 내부 클래스

        MyType myType = new MyType() {
            @Override
            public void hello() {
                System.out.println("fuck you");
            }
        };

        myType.hello();

        // 람다식 -> 추상 메서드가 하나일 때만 가능
        MyType myType2 = () -> {
            System.out.println("람다다 임마 ~");
        };
        myType2.hello();
        // 람다식 -> 추상 메서드가 하나일 때만 가능
        MyType myType3 = () -> System.out.println("이것도 람다다 임마 ~");
        myType3.hello();

        YourType yourType = new YourType() {
            @Override
            public void talk(String message) {
                System.out.println(message + "라고 떠들기");
            }
        };
        yourType.talk("똥이나먹어라");

        MyNumber myNumber = (a, b) -> Math.max(a, b);
        System.out.println(myNumber.getMax(1, 2));

        // Runnable 람다식 구현

        Runnable r = () ->{
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(1000);
                }catch (Exception e){
                }
                System.out.println(i);
            }
        };

        Thread t = new Thread(r);
        t.start();


    }
}
