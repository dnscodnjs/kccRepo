package kosa.stream;

import java.util.*;
import java.util.stream.Stream;

public class StreamExam {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("윤");
        set.add("박");
        set.add("김");

        Stream<String> stream  = set.stream();

        stream.forEach(name -> System.out.println(name));
    }
}
