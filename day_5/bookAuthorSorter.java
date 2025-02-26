package day_5;
import java.util.Comparator;
public class bookAuthorSorter implements Comparator<Book> {
    @Override
    public int compare(Book b1, Book b2) {
                return b1.getauthor().compareTo(b2.getauthor());
    }
}
