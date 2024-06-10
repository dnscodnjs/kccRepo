package kosa.board;

public class BoardInfo {
    // 게사판
    // 게시물번호, 게시물 제목, 게시물 내용, 저자
    private int BoardNo;
    private String title;
    private String content;
    private String writer;

    public BoardInfo(){

    }

    public BoardInfo(int BoardNo, String title, String content, String writer) {
        this.BoardNo = BoardNo;
        this.title = title;
        this.content = content;
        this.writer = writer;
    }

    public int getBoardNo() {
        return BoardNo;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }
}
