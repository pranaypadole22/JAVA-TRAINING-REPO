package day_4;
import java.io.File;
import java.io.IOException;
public class FileDemo {
    public static void main(String[] args) {
        File f = new File("\"C:\\Users\\HP\\OneDrive\\Desktop\\JAVA ASSIGNMENTS\\Pranay.java\""); // Provide a valid file path
        System.out.println("File name: " + f.getName());
        System.out.println("Path: " + f.getPath());
        System.out.println("Absolute path: " + f.getAbsolutePath());
        System.out.println("Parent: " + f.getParent());
        System.out.println("Exists: " + f.exists());
        if (f.exists()) {
            System.out.println("It is writable: " + f.canWrite());
            System.out.println("It is readable: " + f.canRead());
            System.out.println("It is directory: " + f.isDirectory());
            System.out.println("File size in bytes: " + f.length());
        }
    }
}


