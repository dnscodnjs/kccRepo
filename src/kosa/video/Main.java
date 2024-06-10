package kosa.video;

public class Main {
    public static void main(String[] args) {
        Video v1 = new Video("아이언맨", "윤채원");
        Video v2 = new Video("서울의봄", "황정미");

        GeneralMember m1 = new GeneralMember("윤채원", "경기도 광주");
/*        m1.rental(v1);
        m1.show();*/

        System.out.println();

        /*SpecialMember s1 = new SpecialMember("홍길동", "서울");
        s1.rental(v2);
        s1.rental(v1);
        s1.show();*/

        GeneralMember[] arr = {
                new GeneralMember("홍길동", "서울"),
                new SpecialMember("박길동", "제주도")
        };


        for (int i = 0; i < arr.length; i++) {
            arr[i].rental(v1);
            arr[i].show();
            if(arr[i] instanceof SpecialMember){
                ((SpecialMember) arr[i]).specialPrint();
            }

            System.out.println("=============");
        }




    }
}
