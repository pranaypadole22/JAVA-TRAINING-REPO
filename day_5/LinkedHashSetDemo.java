package day_5;

import java.util.HashSet;
import java.util.LinkedHashSet;
//LinkedHashSet (THEORY)
//hashtable and linkedList implementation of the set interface.
//it maintains insertion  order.
//it inherits hashset class and implements set interface
//contains unique elements only like hashset
//provides all optional set operations,and permits null elements.
public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<Integer> hs=new LinkedHashSet<Integer>();
        hs.add(56);
        hs.add(89);
        hs.add(78);
        hs.add(98);
        hs.add(655);
        hs.add(12);
        hs.add(12);
        hs.add(null);
        System.out.println("Hashset is "+hs);
    }
}
