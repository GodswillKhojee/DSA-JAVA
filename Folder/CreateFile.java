package Folder;

import java.io.*;
public class CreateFile {
    public static void main(String[] args) {
        try{
            try (FileOutputStream fos = new FileOutputStream("/home/godswillkhojee/MayBeStudy/studying things/DSA/DSA-JAVA/src/Folder/text.txt");)
            {
                String str = "learn java -> first time file handling";
                String str2 = "2nd way of doing this";

//            fos.write(str.getBytes());
 
                byte[] b = str.getBytes();
//            for(byte ele:b) fos.write(ele);
                fos.write(b, 6, str.length() - 6);
                fos.close();
            }
        }
        catch (FileNotFoundException e){
            System.out.println(e);
        }
        catch (IOException e)
        {
            System.out.println(e);
        }
    }
}
