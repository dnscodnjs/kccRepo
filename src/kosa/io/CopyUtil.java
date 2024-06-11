package kosa.io;

import java.io.*;

public class CopyUtil {
    //source : 원본 파일 경로
    // dest : 복사되는 새로운 파일

    public static void copyFile(File source, File dest) {
        FileOutputStream fos = null;
        FileInputStream fis = null;

        try {
            fos = new FileOutputStream(dest); // 확장자 안중요함
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

    public static void copyDirect(File source, File dest) {
        if (source.isDirectory()) {
            dest.mkdirs();

            File[] files = source.listFiles();

            for (File file : files) {
                File dest3 = new File(dest.getPath()+File.separator+source.getName());
                if(source.isDirectory()) {
                    // /디렉토리 이름 C:\\KCC\\homeWork

                    //dest.mkdirs(); //들어올 때 dest
                    //File dest3 = new File(dest.getPath()+File.separator+source.getName());
                    if(!dest3.exists()) dest3.mkdir();

                    for(File copyFile : source.listFiles()) {
                        copyDirect(copyFile, dest3);
                    }
                }else {
                    //File dest = new File(dest,source.getName());
                    copyFile(source, dest3);
//
                }
            }
        }
    }
}
