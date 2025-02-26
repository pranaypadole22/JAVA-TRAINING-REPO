package day_5;
//Example of ArrayList (Collection framework)
import java.util.ArrayList;
import java.util.List;
public class BookList {
    public static void main(String[] args) {
        List<Book>blist=new ArrayList<Book>();//Access book from Book class(in day_5 package/folder)
        blist.add(new Book("Let us C","YK",300));
        blist.add(new Book("C++","PP",500));
        blist.add(new Book("Core Java","Md",900));
        System.out.println("List of books is"+blist);
        double t=0;
        for(Book b:blist){
            t=t+b.getprice();
        }
        System.out.println("Total price="+t);
    }
}
