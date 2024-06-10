package kosa.api;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DateMission {
    public static void main(String[] args) {
        // 입사일을 입력 받아 재직한 기간 계산
        String pattern = "yyyy/MM/dd";
        DateFormat df = new SimpleDateFormat(pattern);

        Scanner sc = new Scanner(System.in);
        System.out.print("입력 : ");
        Date inDate = null;

        while (sc.hasNextLine()) {
            try {
                inDate = df.parse(sc.nextLine());
                break;
            } catch (Exception e) {
                System.out.print("다시 입력 : ");
            }

        }
        Calendar start = Calendar.getInstance(); // 입사일
        start.setTime(inDate);

        Calendar today = Calendar.getInstance(); // 오늘 날짜
        long day = (today.getTimeInMillis() - start.getTimeInMillis()) / (24 * 60 * 60 * 1000);
        int year = (int) (day / 365);
        int mon = (int) (day % 365) % 30;

        System.out.println("재직 기간 : " + year + "년 " + mon + "개월");
    }
}
