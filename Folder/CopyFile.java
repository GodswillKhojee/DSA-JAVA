package Folder;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyFile {
    public static void main(String[] args) throws Exception{
        FileInputStream fis = new FileInputStream("/home/godswillkhojee/MayBeStudy/studying things/DSA/DSA-JAVA/src/Folder/S.txt");
        FileOutputStream fos = new FileOutputStream("/home/godswillkhojee/MayBeStudy/studying things/DSA/DSA-JAVA/src/Folder/S2.txt");
        int b;
        while((b=fis.read())!= -1)
        {
            if(b>= 56 && b <= 90) fos.write(b+32);
            else fos.write(b);
        }
        fis.close();
        fos.close();
    }
}
