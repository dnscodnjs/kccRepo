package kosa.phone;

import java.io.Serializable;

public class PhoneInfo implements Serializable {
    String name;
    String phoneNo;
    String birth;

    public PhoneInfo(){
    }

    public PhoneInfo(String name, String phoneNo, String birth) {
        this.name = name;
        this.phoneNo = phoneNo;
        this.birth = birth;
    }

    public void show(){
        System.out.println("====검색 결과====");
        System.out.println("이름: " + name);
        System.out.println("번호: " + phoneNo);
        System.out.println("생일: " + birth);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    @Override
    public String toString() {
        return "PhoneInfo{" +
                "name='" + name + '\'' +
                ", phoneNo='" + phoneNo + '\'' +
                ", birth='" + birth + '\'' +
                '}';
    }
}