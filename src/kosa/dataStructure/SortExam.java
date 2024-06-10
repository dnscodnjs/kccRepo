package kosa.dataStructure;

import java.util.Comparator;
import java.util.Random;
import java.util.TreeSet;

public class SortExam {
    public static void main(String[] args) {
        // 기본 정렬 : Comparable => compareTo 오버라이딩
        // 정렬기준 변경 : Comparator => compare() 오버라이딩

        Random r = new Random();
        TreeSet<Integer> set = new TreeSet<>((o1, o2) -> o2 - o1);

        while (true){
            set.add(r.nextInt(45) + 1);
            if(set.size() == 6) break;
        }
        System.out.println(set);
    }
}
