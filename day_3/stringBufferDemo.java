package day_3;

public class stringBufferDemo {
    public static void main(String[] args) {
        StringBuffer s1=new StringBuffer("Java");
        System.out.println("s1="+s1);
        System.out.println("Hashcode s1="+s1.hashCode());

        s1=s1.append("Rules");
        System.out.println("After append s1= "+s1);
        System.out.println("Hashcode s1="+s1.hashCode());
    }
}
