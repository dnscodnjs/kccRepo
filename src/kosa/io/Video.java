package kosa.io;

import java.io.Serializable;

public class Video implements Serializable {
    private int videoNo = 1;
    private String title;
    private String hero;

    public Video() {
    }

    public Video(String title, String hero) {
        this.videoNo++;
        this.title = title;
        this.hero = hero;
    }

    // 비디오 등록, 리스트, 수정, 삭제
    public void show() {
        System.out.println("회원이 빌린 비디오 번호 : " + videoNo);
        System.out.println("회원이 빌린 비디오 제목 : " + title);
        System.out.println("회원이 빌린 비디오 주인공 : " + hero);
    }

    public int getVideoNo() {
        return videoNo;
    }

    public void setVideoNo(int videoNo) {
        this.videoNo = videoNo;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getHero() {
        return hero;
    }

    public void setHero(String hero) {
        this.hero = hero;
    }

    @Override
    public String toString() {
        return "Video{" +
                "videoNo=" + videoNo +
                ", title='" + title + '\'' +
                ", hero='" + hero + '\'' +
                '}';
    }
}
