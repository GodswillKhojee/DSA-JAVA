package Folder;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;

public class AppendingFIle {
    public static void main(String[] args)throws Exception {
        FileInputStream fis1 = new FileInputStream("/home/godswillkhojee/MayBeStudy/studying things/DSA/DSA-JAVA/src/Folder/S.txt");
        FileInputStream fis2 = new FileInputStream("/home/godswillkhojee/MayBeStudy/studying things/DSA/DSA-JAVA/src/Folder/S2.txt");
        FileOutputStream fos = new FileOutputStream("Destination.txt");
        SequenceInputStream sis = new SequenceInputStream(fis1,fis2);
        int b;
        while((b=sis.read())!= -1)
        {
            fos.write(b);
        }
        fis1.close();
        fis2.close();
        sis.close();

    }
}
