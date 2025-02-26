package day_5;

import java.util.ArrayList;
import java.util.List;

public class playerList {
    public static void main(String[] args) {
        List<players> plist=new ArrayList<players>();//Access book from Book class(in day_5 package/folder)
        plist.add(new players("Rohit","45",300));
        plist.add(new players("Pranay Padole","22",900));
        System.out.println("List of players is"+plist);
        double t=0;
        for(players p:plist){
            t=t+p.getRun();
        }
        System.out.println("Total Run="+t);
    }
}
