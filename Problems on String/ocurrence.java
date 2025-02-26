package strings;

import java.util.Scanner;

public class ocurrence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:");
        String s=sc.nextLine();
        System.out.print("Enter the character to count: ");
        char target = sc.next().charAt(0);
        sc.close();
        int count=0;
        for (int i = 0; i <s.length() ; i++) {
            if (s.charAt(i) == target) {
                count++;
            }
        }
        System.out.println(count);
    }
}
