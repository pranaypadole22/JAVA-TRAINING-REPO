package day_4;

import java.util.Scanner;
import java.util.StringTokenizer;

public class stringTokenizationDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String:-");
        String s=sc.nextLine();

//        StringTokenizer st=new StringTokenizer(s);
//
//        System.out.println("No. of Words are: "+st.countTokens());
//        System.out.println("All tokens are");
//        while(st.hasMoreTokens()){
//            System.out.println(st.nextToken());
//        }
        String[] arr=s.split(" ");
        System.out.println("No.of words "+arr.length);
        System.out.println("All words are: ");
        for (String s1:arr) {
            System.out.println(s1);

        }
    }

}
