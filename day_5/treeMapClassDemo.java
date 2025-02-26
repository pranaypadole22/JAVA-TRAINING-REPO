package day_5;

import java.util.TreeMap;

public class treeMapClassDemo {
    public static void main(String[] args) {
        TreeMap<Integer,String> tm=new TreeMap<Integer, String>();
        tm.put(20,"Pranay");
        tm.put(22,"Piyush");
        tm.put(12,"Pbutle");
        tm.put(56,"Pran");
        //tm.put(null,null); gives error;
        System.out.println("TreeMapClass: "+tm);

    }
}
