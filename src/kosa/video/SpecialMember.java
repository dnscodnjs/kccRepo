package kosa.video;

public class SpecialMember extends GeneralMember {
    private int bonus;

    public SpecialMember() {
    }

    public SpecialMember(String name, String address) {
        super(name, address);
    }

    @Override
    public void rental(Video video) {
        super.rental(video);
        this.bonus += 10;
    }

    public void show() {
        super.show();
        System.out.println("회원의 보너스 포인트 적립 : " + bonus);
    }
    
    public void specialPrint(){
        System.out.println("스페셜 멤버");
    }
}
