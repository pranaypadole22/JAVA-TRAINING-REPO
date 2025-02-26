package day_5;
import java.util.Comparator;
public class BookpriceSorter  implements Comparator<Book> {
    @Override
    public int compare(Book b1, Book b2) {
        if(b1.getprice()>b2.getprice())
            return 1;
        else
        if(b1.getprice()<b2.getprice())
            return -1;
           else
               return 0;
    }
}
