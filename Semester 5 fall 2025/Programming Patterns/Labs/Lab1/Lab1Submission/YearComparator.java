import java.util.Comparator;
public class YearComparator implements Comparator<Book>{
    public int compare(Book b1, Book b2){
        return Integer.compare(b1.getYearPublished(), b2.getYearPublished());
    }
}
