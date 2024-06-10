package kosa.dataStructure;

import java.util.HashMap;
import java.util.*;

public class MapExam {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("1", "KIA");
        map.put("2", "LG");
        map.put("3", "SAMSUNG");

        System.out.println("사이즈 : " + map.size());

        if(map.containsValue("LG")) map.remove("2");

        System.out.println("사이즈 : " + map.size());
        System.out.println("삼성팀 : " + map.get("3"));

        // Map.Entry(이너 인터페이스)
        for (Map.Entry<String, String> entrySet : map.entrySet()) {
            System.out.println(entrySet.getKey() + " : " + entrySet.getValue());
        }


    }
}
