package kosa.io;

import java.io.File;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class FileMission {
    public static void main(String[] args) throws IOException {
        // 1. 바이트스트팀을 이용하여 이미지 파일을 복사
        String source = "C:\\KCC\\ppt\\puppy.JPG";
        String dest = "C:\\KCC\\temp\\puppy.JPG";

        CopyUtil.copyFile(new File(source), new File(dest));

/*        // 2 번째 방법
        File source = new File("C:\\\\KCC\\\\ppt\\\\puppy.JPG");
        File dest = new File("C:\\\\KCC\\\\temp\\\\puppy.JPG");

        Files.copy(source.toPath(), dest.toPath(), StandardCopyOption.REPLACE_EXISTING);*/
    }
}
