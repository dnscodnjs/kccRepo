package kosa.Inheritance;

public class AccountMain {
    public static void main(String[] args) throws Exception {
        CheckingAccount ca = new CheckingAccount("111-111", "홍길동", 1240000, "222-222");
        ca.pay("222-222", 240000);

        MinusAccount ma = new MinusAccount("111-111", "홍길동", 1240000, 10000);
        ma.withdraw(500);

        // 오브젝트 형변환
        Account ac = new CheckingAccount("111-111", "홍길동", 1240000, "222-222");
//        ac.pay("222-222", 240000);

        Account ac2 = new Account("111-111", "홍길동", 1240000);

        //강제 형변환
        CheckingAccount obj = (CheckingAccount) ac;
        // 강제 형변환을 통해 자식 메서드를 사용할 수 있게 됨, 원래는 불가능 했어
        obj.pay("222-222", 500);

        // 배열로 넣기
        Account arr[] = {
                new Account("111-111", "홍길동", 1240000),
                new CheckingAccount("111-111", "홍길동", 1240000, "222-222"),
                new MinusAccount("111-111", "홍길동", 1240000, 10000)
        };

        // instanceof 연산자를 사용해서 객체타입을 확인하는 것
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] instanceof CheckingAccount){
                try {
                    ((CheckingAccount)arr[i]).pay("222-222", 400);
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }


    }
}
