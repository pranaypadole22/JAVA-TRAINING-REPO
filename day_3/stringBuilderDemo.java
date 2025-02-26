package day_3;

import java.util.Scanner;

public abstract class stringBuilderDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String");
        String s=sc.next();
        //make string mutable
        StringBuilder bd=new StringBuilder(s);
        StringBuilder rev=new StringBuilder();
        for (int i=bd.length()-1;i>=0;i--){
            rev.append((bd.charAt(i)));
            System.out.println("Rev is "+rev);
        }
    }

}
//count the nuber of vowels from the string.
//Accept the string from user and check it pallindrome or not
//wap to count no.of occurences of character from the string 