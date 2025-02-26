package day_5;

import java.util.ArrayList;
import java.util.List;

//Theory:
//it is also used for sorting but we can sort on different criteria.
//it is present in package java.util
//it has only one method
//  public int compare(Object obj1,Object obj2{
//  }
//-It returns 1,value1>value2.
//It returns -1,value1<value2
//It returns 0,value1==value2
//problem statement.
//create separate classes for each sorting criteria which implement
//comparator Interface.
public class comparatorInterface {
    public static void main(String[] args) {
        List<Book>bList=new ArrayList<Book>();
        bList.add(new Book("Java","kj",600));
        bList.add(new Book("apple","hhj",500));
        bList.add(new Book("ava","cz",100));
        bList.add(new Book("hite","pp",60));

        bList.sort(new BookpriceSorter());
        System.out.println("\n List sorted on price"+bList);
        bList.sort(new bookNameSorter());
        System.out.println("\n List sorted on Name"+bList);
        bList.sort(new bookAuthorSorter());
        System.out.println("\n List sorted on Author"+bList);
    }

}
