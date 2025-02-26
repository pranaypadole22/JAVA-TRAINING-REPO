package day_5;

import java.util.Iterator;
import java.util.LinkedList;

public class linkedListDemo {
    public static void main(String[] args) {
        LinkedList<String>fruits=new LinkedList<String>();
        fruits.add("Mango");
        fruits.add("grapes");
        fruits.add("Apple");
        fruits.add("Banana");
        System.out.println("List of fruits: "+fruits);

        fruits.remove(1);
        System.out.println("after RemovalList of fruits: "+fruits);
        Iterator<String> itr=fruits.descendingIterator();
        System.out.println("Reverse List is ");
        while(itr.hasNext()){
            System.out.println(itr.next());
        }


    }
}
