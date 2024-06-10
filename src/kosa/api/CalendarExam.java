package kosa.api;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarExam {
    public static void main(String[] args) {
        Calendar gc = Calendar.getInstance();
//        System.out.println(gc);
        System.out.println(gc.get(Calendar.YEAR) + "년 " + (gc.get(Calendar.MONTH) + 1) + "월 " + gc.get(Calendar.DATE) + "일");

        gc.add(Calendar.DATE, 100);
        System.out.println("100일 후 : " + gc.get(Calendar.YEAR) + "년 " + (gc.get(Calendar.MONTH) + 1) + "월 " + gc.get(Calendar.DATE) + "일");

        gc.set(2022, 5, 4);
        gc.add(Calendar.DATE, 1000);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");

        System.out.println(sdf.format(gc.getTime()));

        for (int year = 2024; year <= 2030; year++) {
            gc = new GregorianCalendar(year, Calendar.DECEMBER, 2);
            int dayOfWeek = gc.get(Calendar.DAY_OF_WEEK);
            String dayOfWeekString = "";

            switch (dayOfWeek) {
                case 1:
                    dayOfWeekString = "일요일";
                    break;
                case 2:
                    dayOfWeekString = "월요일";
                    break;
                case 3:
                    dayOfWeekString = "화요일";
                    break;
                case 4:
                    dayOfWeekString = "수요일";
                    break;
                case 5:
                    dayOfWeekString = "목요일";
                    break;
                case 6:
                    dayOfWeekString = "금요일";
                    break;
                case 7:
                    dayOfWeekString = "토요일";
                    break;
            }

            System.out.println(year + "년 생일의 요일은 " + dayOfWeekString);
        }

    }

}
