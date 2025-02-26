package day_3;

public class stringDemo {
    public static void main(String[] args) {
        String s1="Hello";
        System.out.println("S1"+s1);
        System.out.println("Hashcode of S1="+s1.hashCode());

        s1=s1.concat("Bye");
        System.out.println("s1="+s1);
        System.out.println("Hashcode of S1="+s1.hashCode());


        //another method to initialize a string.
        String s2=new String("Pranay");
        System.out.println(s2);
    }
}
