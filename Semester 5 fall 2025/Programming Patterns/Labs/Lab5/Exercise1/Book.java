package Exercise1;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Book implements Comparable<Book>{
    private String title;
    private int publishYear;
    public Book(String title, int publishYear) {
        this.title = title;
        this.publishYear = publishYear;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public int getPublishYear() {
        return publishYear;
    }
    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }
    @Override
    public String toString() {
        return "Book [title=" + title + ", publishYear=" + publishYear + "]";
    }

    public static void main(String[] args) {
        HashSet<Book> bookSet = new HashSet<>();
        LinkedHashSet<Book> bookLHS = new LinkedHashSet<>();
        TreeSet<Book> bookTS = new TreeSet<>();

        bookSet.add(new Book("Assassination Classroom", 2009));
        bookSet.add(new Book("Mushoku Tensei", 2011));
        bookSet.add(new Book("Distractible", 2020));
        System.out.println("HashSet");
        bookSet.forEach(System.out::println);
        System.out.println();

        bookLHS.add(new Book("Assassination Classroom", 2009));
        bookLHS.add(new Book("Mushoku Tensei", 2011));
        bookLHS.add(new Book("Distractible", 2020));
        System.out.println("LinkedHashSet");
        bookLHS.forEach(System.out::println);
        System.out.println();

        bookTS.add(new Book("Assassination Classroom", 2009));
        bookTS.add(new Book("Mushoku Tensei", 2011));
        bookTS.add(new Book("Distractible", 2020));
        System.out.println("TreeSet");
        bookTS.forEach(System.out::println);
        System.out.println();
    }
    @Override
    public int compareTo(Book o) {
        return this.getTitle().compareTo(o.getTitle());
    }
    
}
