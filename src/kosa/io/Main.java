package kosa.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {

    Member member;

    // 객체 직렬화 _ 객체를 외부(파일)로 보내는 것
    public void insert() {
        member = new Member("홍길동", 30, new Video("아이언맨", "윤채원"));
        ObjectOutputStream oos = null;

        try {
            oos  = new ObjectOutputStream(new FileOutputStream("object.txt")); // 확장자 안중요함
            oos.writeObject(member);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                oos.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }


    // 객체 역직렬화
    public void show() {
        ObjectInputStream ois = null;

        try {
            ois = new ObjectInputStream(new FileInputStream("object.txt"));
            member = (Member) ois.readObject();

        }catch (Exception e ){
            e.printStackTrace();
        }finally {
            try {
                ois.close();
            }catch (Exception e ){
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.insert();

        main.member = null;

        main.show();

        System.out.println(main.member);

    }
}
