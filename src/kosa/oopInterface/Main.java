package kosa.oopInterface;

public class Main {
    public static void main(String[] args) {
        Object[] objects = {new Reader("둘리"), new Work("길동"), new Student("마이클")};

        for (int i = 0; i < objects.length; i++) {
            if (objects[i] instanceof Speakable) {
                System.out.println((((Speakable) objects[i]).speak()));
            }
        }
    }
}
