public class Book {
    private Author author;
    private int publicationYear;
    private String title;

    public Book(Author author, int publicationYear, String title) {
        this.publicationYear = publicationYear;
        this.title = title;
        this.author = author;
    }

    public int getPublicationYear() {
        return this.publicationYear;
    }

    public String getTitle() {
        return this.title;
    }

    public Author getAuthor() {
        return this.author;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public String toString() {
        return author + " " + "'" + title + "'" + " " + publicationYear;
    }

    public boolean equals(Object other) {
        if ( this.getClass () != other.getClass () ) {
            return false;
        }
        Book book2 = (Book) other;
        return author.equals ( book2.author ) && title.equals ( book2.title ) && publicationYear == (book2.publicationYear);
    }

    public int hashCode() {
        return java.util.Objects.hash ( author ) + java.util.Objects.hash ( publicationYear ) + java.util.Objects.hash ( title );
    }
}
