package kosa.phone;

public class Universe extends PhoneInfo{
    private String dept;
    private String position;

    public Universe(){}

    public Universe(String name, String phoneNo, String birth, String dept, String position) {
        super(name, phoneNo, birth);
        this.dept = dept;
        this.position = position;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("부서 : " + dept);
        System.out.println("직책 : " + position);
    }
}
