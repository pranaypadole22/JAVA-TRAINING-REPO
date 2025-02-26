package day_4;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferredReaderDemo {
    public static void main(String[] args)throws IOException {
        FileInputStream fis=new FileInputStream("f.txt");
        BufferedInputStream bis=new BufferedInputStream(fis);

        int ch;
        System.out.println("Content of file r ");
        while((ch=bis.read())!=-1)
            System.out.println((char)ch);
        bis.close();
        fis.close();
    }
}
