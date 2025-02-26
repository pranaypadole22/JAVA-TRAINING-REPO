package day_5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class arrayListDemo {
    public static void main(String[] args) {
    ArrayList<String>names=new ArrayList<String>();
    names.add("Pranay");
    names.add("Padole");
    names.add("Chinu");
        System.out.println("List of names= "+names);
        names.add(3,"XYZ");
        System.out.println("After insertion List of names="+names);
        System.out.println("List using forEach loop");
        for (String s:names) {
            System.out.println(s);
        }
        Iterator<String>itr=names.iterator();
        System.out.println("Using Iterator");
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }

}
