package kosa.dataStructure;

import java.util.*;

public class MapMission {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("김자바", 90);
        map.put("윤자바", 80);
        map.put("박자바", 20);
        map.put("이자바", 50);
        map.put("황자바", 40);

        int sum = 0;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
            sum += entry.getValue();
        }

        System.out.println("최고 점수 : " + Collections.max(map.values()));
        System.out.println("최저 점수 : " + Collections.min(map.values()));
        System.out.println("총점 : " + sum);
        System.out.println("평균 점수 : " + sum / map.size());

    }
}
