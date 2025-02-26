package day_5;
import java.util.TreeSet;
//it cannot insert null value
//implements the sorted set interface that uses a tree of storage
//the objects of tree set class arre stored in ascending order
//contains unique elements only like HashSet.
public class treeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> ts=new TreeSet<Integer>();
        ts.add(89);
        ts.add(898);
        ts.add(898);
        ts.add(8985);
        ts.add(8945);
        ts.add(489);
//        ts.add(null); null not allowed
        System.out.println("Tree is: \n"+ts);
    }
}
