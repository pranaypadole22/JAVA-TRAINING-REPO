package day_5;

import java.util.HashMap;

//HashMapClass theory:
//it implements the map interface by using hashtable
//it implements  map interface
//hashmap contains the value based on the key
//It contains only unique elements
//it may have one null key and multiple null values
//it maintains no order
public class hashMapClass {
    public static void main(String[] args) {
        HashMap<String,String>hm=new HashMap<String,String>();
        hm.put("020","Pune");
        hm.put("010","Mumbai");
        hm.put("090","Nagpur");
        hm.put("0120","Tumsar");
        hm.put("0780","Bhandara");
        System.out.println("HashMap is:"+hm);

    }
}
