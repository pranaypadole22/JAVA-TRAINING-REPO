package day_4;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class textWriting {
    public static void main(String[] args)throws IOException {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String: ");
        String s=sc.nextLine();

        FileWriter fw=new FileWriter("f.txt");
        BufferedWriter bw=new BufferedWriter(fw);

        bw.write(s);
        bw.close();
        fw.close();
        System.out.println("Data Written to file");
    }
}
