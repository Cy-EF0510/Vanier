import java.util.*;


public class Main {
    public static void main(String[] args) {
        ArrayList<Book> book = new ArrayList<Book>();

        Book book1 = new Book("Atomic Habits", "James Clear", 2018);
        Book book2 = new Book("HTML5 and CSS3, Illustrated Introductory", "Sasha Vodnik", 2015);
        Book book3 = new Book("How to Talk to Anyone", "Leil Lowndes", 1999);
        Book book4 = new Book("Dracula", "Bram Stoker", 1897);
        Book book5 = new Book("JavaScript and JQuery: Interactive Front-End Web Development", "Jon Duckett", 2013);
        
        book.add(book1);
        book.add(book2);
        book.add(book3);
        book.add(book4);
        book.add(book5);

        //print toString of each book
        for(Book i : book){
            System.out.println(i.toString());
        }
        System.out.println();

        //fin and print the book with the highest yearPublished
        Book highestYear = new Book(null, null, 0);
        for(Book i : book){
            if(i.getYearPublished() > highestYear.getYearPublished()){
                highestYear = i;
            }
        }
        System.out.println("Highest Year Published: " + highestYear.getYearPublished() + ", " + highestYear.getTitle());


        //Exercise 2: Implementing Sorting strategies
        //Using the comparable
        Collections.sort(book);
        for(Book i : book){
            System.out.println(i.getTitle());
        }
        System.out.println();

        //Comparator for Author
        System.out.println("Sort by Author name: ");
        Collections.sort(book, new AuthorComparator());
        for(Book i : book){
            System.out.println(i.getAuthor() + " " + i.getTitle());
        }
        System.out.println();

        //Comparator for YearPublished
        System.out.println("Sort by Year published: ");
        Collections.sort(book, new YearComparator());
        for(Book i : book){
            System.out.println(i.getYearPublished() + " " + i.getTitle());
        }
        System.out.println();

        //Part 3: Functional Programming with Lambda Expressions
        //Sorting with a Lambda Expression
        //Sorted by title
        System.out.println("Sorting with a Lambda Expression\n");

        // sort by book title ascending
        System.out.println("Sorted by Title");
        book.sort(Comparator.comparing(Book::getTitle));
        book.forEach(System.out::println);
        // Collections.sort(book, (b1, b2) -> b1.getTitle().compareTo(b2.getTitle()));
        // for(Book i : book){
        //     System.out.println(i.getTitle());
        // }
        System.out.println();

        // sort by author name
        System.out.println("Sorted by Author Name");
        Collections.sort(book, (b1, b2) -> b1.getAuthor().compareTo(b2.getAuthor()));
        for(Book i : book){
            System.out.println(i.getAuthor() + ", " + i.getTitle());
        }
        System.out.println();

        //sort by yearpublished descending
        System.out.println("Sorted by Year Published");
        book.sort(Comparator.comparing(Book::getYearPublished).reversed());
        for(Book i : book){
            System.out.println(i.getYearPublished() + ", " + i.getTitle());
        }
        System.out.println();

        //Programming Exercise
        System.out.println("Most recent published book: " + book.stream().max(Comparator.comparing(Book::getYearPublished)).get());

        //Lambda Expression test
        Runnable task = () -> System.out.println("Hello, Lambda");
        task.run();
    }
}
