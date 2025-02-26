package day_5;
//HASHSET
//it is store elements by using a mechanism called hashing.
//hashset contains unique elements only.
//It does not maintain insertion order.
import java.util.HashSet;

public class hashSetDemo {
    public static void main(String[] args) {
        HashSet<Integer> hs=new HashSet<Integer>();
        hs.add(56);
        hs.add(89);
        hs.add(78);
        hs.add(98);
        hs.add(655);
        hs.add(12);
        hs.add(null);
        System.out.println("Hashset is "+hs);

    }
}
