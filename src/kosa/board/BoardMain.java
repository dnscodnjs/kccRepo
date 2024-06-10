package kosa.board;


import java.util.Scanner;

public class BoardMain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        BoardManager m = new BoardManager();

        while(true){
            System.out.println("1.추가 2. 전체출력 3. 수정 4. 삭제 5. 종료");
            System.out.println("메뉴 입력 : ");
            String menu = in.nextLine();

            switch (menu){
                case "1":
                    m.insert();
                    break;
                case "2":
                    m.list();
                    break;
                case "3":
                    m.update();
                    break;
                case "4":
                    m.delete();
                    break;
                case "5":
                    System.out.println("프로그램 종료");
                    return;
                default:
                    System.out.println("번호 제대로 입력해라");
                    break;
            }
        }
    }
}
