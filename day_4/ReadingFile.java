package day_4;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
public class ReadingFile {
    public static void main(String[] args)throws IOException {
        FileInputStream fis=new FileInputStream("pranay.txt");

        int ch;
        System.out.println("Content of file are \n ");
        while((ch= fis.read())!= -1)
            System.out.println((char)ch);
        fis.close();
    }
}
