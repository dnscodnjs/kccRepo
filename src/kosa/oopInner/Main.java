package kosa.oopInner;

public class Main {
    public static void main(String[] args) {

        Student student = new Student();
        String name = "윤채원";

        Person p1 = new Person(name, student);
        Person p2 = new Person("윤지원", new Work());

        // 익명 내부 클래스
        Person p3 = new Person("홍길동", new Role() {
            @Override
            void doing() {
                System.out.println("드라이빙 역할");
            }
        });

        p1.doit();
        p2.doit();
        p3.doit();
    }
}
