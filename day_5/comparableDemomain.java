package day_5;

import java.util.ArrayList;
import java.util.List;

public class comparableDemomain {
    public static void main(String[] args) {
        List<comparableInterface> sList=new ArrayList<comparableInterface>();
        sList.add(new comparableInterface(1,"Pranay",22));
        sList.add(new comparableInterface(2,"Piyush",10000));
        sList.add(new comparableInterface(8,"Priyanshu",96));
        sList.add(new comparableInterface(6,"Srushti",36));
        System.out.println("List of students is"+sList);
        sList.sort(null);
        System.out.println("Sorted List is"+sList);



    }
}
