import java.sql.SQLOutput;
import java.util.Scanner;

public class vowels {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:- ");
        String s=sc.nextLine();
        sc.close();
        int count=0;
        s=s.toLowerCase();
        for (int i = 0; i<s.length() ; i++) {
        char ch=s.charAt(i);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
          count++;
        }
        }
        System.out.println("Number of vowels is provided string are:-"+count);
    }
}
