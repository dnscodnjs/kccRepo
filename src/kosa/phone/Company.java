package kosa.phone;

public class Company extends PhoneInfo {
    private String major;
    private String year;

    public Company(){}

    public Company(String name, String phoneNo, String birth, String major, String year) {
        super(name, phoneNo, birth);
        this.major = major;
        this.year = year;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("전공 : " + major);
        System.out.println("학번 : " + year);
    }
}
