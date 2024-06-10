package kosa.api;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExam {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        System.out.println(date);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");

        System.out.println(sdf.format(date));

        // 날짜 입력
        DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
        Date date1 = null;

        date1 = df.parse("2024/06/04");
        System.out.println(date1);
    }
}
