package day_4;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

//2 types files-
    //1)Text file-Character Stream
    //2)Binary File-Byte Stream
//File-
//it is a collection of related data
//all the classes are present in java.io package
//Binary File(we studied)
//InputStream(Reading) -1)FileInputStream
//              2)BufferredInputStream
//OutputStream(Writing)-1)FileOutputStream
//                      2)BufferredOutputStream
public class fileHandlingDemo {//Writing DAta

    public static void main(String[] args)throws IOException {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String: ");
        String s=sc.nextLine();

        //open file for writing.
        FileOutputStream fos=new FileOutputStream("pranay.txt",true);
        //chaining buffers
        BufferedOutputStream bos= new BufferedOutputStream(fos);
        byte []arr=s.getBytes();
        fos.write(arr);
        System.out.println("Data Written to file");
        fos.close();
    }

}
