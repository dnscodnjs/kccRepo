package kosa.io;

import java.io.*;

public class CopyUtil {
    //source : 원본 파일 경로
    // dest : 복사되는 새로운 파일

    public static void copyFile(File source, File dest) {
        FileOutputStream fos = null;
        FileInputStream fis = null;

        try {
            fos  = new FileOutputStream(dest); // 확장자 안중요함
            fis = new FileInputStream(source);
            fos.write(fis.readAllBytes());

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                fos.close();
                fis.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
