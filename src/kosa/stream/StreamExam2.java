package kosa.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExam2 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("윤");
        list.add("박");
        list.add("김");
        list.add("병렬");

        Stream<String> parallelStream = list.parallelStream();
        parallelStream.forEach(name -> {
            System.out.println(name + ": " + Thread.currentThread().getName());
        });


        List<Student> list2 = Arrays.asList(
                new Student("홍", 30),
                new Student("김", 60),
                new Student("박", 30)
        );

        list2.stream().mapToInt(s -> s.getScore())
                .forEach(score -> System.out.println(score));
        System.out.println("=====================");
        list2.stream().mapToInt(Student::getScore)
                .forEach(System.out::println);

        System.out.println("=====================");
        list2.stream().filter(s -> s.getName().startsWith("홍"))
                .forEach(s -> System.out.println(s.getScore()));


        System.out.println("=====================");
        List<Integer> list3 = IntStream.rangeClosed(1, 10)
                .boxed().collect(Collectors.toList());

        list3.forEach(System.out::println);
        System.out.println("=====================");

        System.out.println(IntStream.of(2, 4, 6, 2, 10).boxed().collect(Collectors.toList()));

        System.out.println("=====================");
        String[] arr = {"BB", "CC", "DD"};
        Arrays.stream(arr).sorted().forEach(System.out::println);

    }
}
