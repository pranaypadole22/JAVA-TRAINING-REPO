package day_3;

import java.util.Scanner;

public class userInputDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String= ");
        String s=sc.nextLine();

        int cnt=0;
        for (int i = 0; i <= s.length() ; i++) {
            if(s.charAt(i)==' ')
                cnt++;
            System.out.println("No. of words are "+(cnt+1));

        }

    }


}
