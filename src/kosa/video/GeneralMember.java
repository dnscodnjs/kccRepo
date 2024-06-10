package kosa.video;

import java.util.List;

public class GeneralMember {


    private int memberNo;
    private String name;
    private String address;
    private Video rentalVideo;

    public GeneralMember(){
    }

    public GeneralMember(String name,String address ) {
        this.address = address;
        this.name = name;
        this.memberNo++;
    }

    public void rental(Video video){
        this.rentalVideo = video;
    }

    public void show(){
        System.out.println("회원 아이디 : " + memberNo);
        System.out.println("회원 이름 : " + name);
        System.out.println("회원 주소 : " + address);
        rentalVideo.show();
    }

    public int getMemberNo() {
        return memberNo;
    }

    public void setMemberNo(int memberNo) {
        this.memberNo = memberNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Video getRentalVideo() {
        return rentalVideo;
    }

    public void setRentalVideo(Video rentalVideo) {
        this.rentalVideo = rentalVideo;
    }
}
