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
}
