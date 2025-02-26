package day_5;
import java.util.Vector;
//dynamic array
//legacy class
//synchronised,slower
public class vectorDemo {
    public static void main(String[] args) {
        Vector<Integer> vInt=new Vector<Integer>();
        vInt.add(26);
        vInt.add(56);
        vInt.add(59);
        vInt.add(86);
        vInt.add(58);
        vInt.add(86);
        vInt.add(1,86);

        System.out.println("Vector is "+vInt);
        vInt.remove(2);
        System.out.println("After removal," + "Vector is "+vInt);
    }
}
