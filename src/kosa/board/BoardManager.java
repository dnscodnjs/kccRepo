package kosa.board;

import java.util.Scanner;

public class BoardManager {

    private BoardInfo[] boardInfo;
    private Scanner in;
    private int count;
    private static int boardNo;

    public BoardManager() {
        boardInfo = new BoardInfo[10];
        in = new Scanner(System.in);
        boardNo = 1;
    }

    public void insert() {
        System.out.print("제목 입력 : ");
        String title = in.nextLine();
        System.out.print("내용 입력 : ");
        String content = in.nextLine();
        System.out.print("저자 입력 : ");
        String writer = in.nextLine();


        boardInfo[count++] = new BoardInfo(boardNo++, title, content, writer);
        System.out.println("===================");

    }

    public void list() {
        for (int i = 0; i < count; i++) {
            System.out.println("게시물 번호 : " + boardInfo[i].getBoardNo() + "번");
            System.out.println("제목 : " + boardInfo[i].getTitle());
            System.out.println("내용 : " + boardInfo[i].getContent());
            System.out.println("저자 : " + boardInfo[i].getWriter());

            System.out.println("===================");
        }
    }

    public void update() {
        System.out.print("수정할 번호 번호 입력 : ");
        int updateNum = in.nextInt();

        in.nextLine();

        System.out.print("수정할 제목 입력 : ");
        String tempTitle = in.nextLine();
        boardInfo[updateNum - 1].setTitle(tempTitle);

        System.out.print("수정할 내용 입력 : ");
        String tempContent = in.nextLine();
        boardInfo[updateNum - 1].setContent(tempContent);

        System.out.print("수정할 저자 입력 : ");
        String tempWriter = in.nextLine();
        boardInfo[updateNum - 1].setWriter(tempWriter);

        System.out.println("===================");
    }

    public void delete() {
        System.out.print("삭제할 번호 입력 : ");
        int num = Integer.parseInt(in.nextLine());

        for (int i = num - 1; i < boardNo; i++) {

                boardInfo[i] = boardInfo[i + 1];
//                boardInfo[i].setTitle(boardInfo[i + 1].getTitle());
//                boardInfo[i].setContent(boardInfo[i + 1].getContent());
//                boardInfo[i].setWriter(boardInfo[i + 1].getWriter());
        }
        boardInfo[count -1] = null;
        count--;

        System.out.println("삭제 되었습니다!");

    }
}
