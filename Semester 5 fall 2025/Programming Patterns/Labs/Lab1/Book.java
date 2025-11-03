public class Book implements Comparable<Book>{
    private String title;
    private String author;
    private int yearPublished;

    public Book(String title, String author, int yearPublished) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    @Override
    public int compareTo(Book other){ //Mandatory method of Comparable
        return this.getTitle().compareTo(other.getTitle());

    }

    @Override
    public String toString() {
        return "Book [title=" + title + ", author=" + author + ", yearPublished=" + yearPublished + "]";
    }

    

}