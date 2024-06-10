package kosa.dataStructure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PersonExam {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();

        personList.add(new Person("홍길동", 20));
        personList.add(new Person("윤길동", 19));
        personList.add(new Person("김길동", 27));
        personList.add(new Person("박길동", 29));
        personList.add(new Person("황길동", 15));

        System.out.println(personList);

//        Collections.sort(personList, (o1, o2) -> o2.getAge() - o1.getAge());

        Collections.sort(personList, (o1, o2) -> o1.getName().compareTo(o2.getName()));

        Collections.sort(personList, Comparator.comparing(Person::getName));

        System.out.println(personList);

    }
}
