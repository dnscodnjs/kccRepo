package kosa.api;

import java.util.Arrays;

public class StringExam {
    public static void main(String[] args) {
        // String 사용 예제
        String str1 = "윤채원";
        String str2 = "윤채원";

        String str3 = new String("윤채원");

        if(str1 == str2) System.out.println("같네");
        if(str3 == str2) System.out.println("같네");

        //String 클래스

        // 이렇게 붙이면 안붙어요 -> String은 불변 객체이다
        str1.concat("귀엽다");
        System.out.println(str1);

        // StringBuilder , StringBuffer 는 가변성 !
        StringBuilder sb = new StringBuilder("ABC");
        sb.append("DEF");
        System.out.println(sb);

        // 해당 문자열의 위치 파악
        System.out.println(str1.indexOf("윤"));;

        for (int i = 0; i < str1.length(); i++) {
            System.out.println(str1.charAt(i));;
        }

        String sub = "도레미파솔라시도";
        System.out.println(sub.substring(2,7));
        System.out.println(sub.indexOf("미파"));

        System.out.println(sub.substring(sub.indexOf("미파"), sub.indexOf("미파") + 2));

        String fileName = "kosa.jpg";

        String header = fileName.substring(0, fileName.indexOf("."));
        String pattern = fileName.substring(fileName.indexOf(".") + 1);

        System.out.println("header = " + header);
        System.out.println("pattern = " + pattern);

        String a = "a";
        String A = "A";

        System.out.println(a.equalsIgnoreCase(A));

        // 공백문자 제거
        String trimA = "   a    ";
        System.out.println(trimA.trim());

        //문자열 String[] 변환
        String fruit = "사과, 포도, 수박, 배";
        String[] fruits = fruit.split(",");
        System.out.println(Arrays.toString(fruits));

        //char 변환
        String string = "abcdef";
        char[] arr = string.toCharArray();
        System.out.println(Arrays.toString(arr));

        String string1 = "abcdef";
        byte[] arr2 = string1.getBytes();
        System.out.println(Arrays.toString(arr2));

    }
}
