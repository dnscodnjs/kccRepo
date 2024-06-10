package kosa.api;

public class PersonMain {
    public static void main(String[] args) {
        Person p1 = new Person("홍길동", 20);
        Person p2 = new Person("박길동", 25);
        Person p3 = new Person("박길동", 25);

        if(p2.equals(p3)) System.out.println("같다");

        System.out.println(p1); 
    }
}
