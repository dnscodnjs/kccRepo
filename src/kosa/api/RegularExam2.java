package kosa.api;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExam2 {
    public static void main(String[] args) {
        String[] data = {
                "bat", "bba", "bbg", "bonus",
                "CA", "ca", "c232", "car",
                "date", "dic", "diraaa"
        };

        Pattern p = Pattern.compile("d[a-z]*");

        for(String str : data){
            if(p.matcher(str).matches()) System.out.println(str);
        }

        String source = "HP:010-1234-1234, HOME: 02-222-2222";
        String reg = "(\\d{2,3}-\\d{3,4}-\\d{4})";

        Pattern p1 = Pattern.compile(reg);
        Matcher m2 = p1.matcher(source);

        while (m2.find()){
            System.out.println(m2.group());
        }
    }
}
