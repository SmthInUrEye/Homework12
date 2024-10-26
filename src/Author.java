public class Author {
    private String authorFirstName;
    private String authorSecondName;

    public Author(String authorFirstName, String authorSecondName) {
        this.authorFirstName = authorFirstName;
        this.authorSecondName = authorSecondName;
    }

    public String getAuthorFirstName() {
        return this.authorFirstName;
    }

    public String getAuthorSecondName() {
        return this.authorSecondName;
    }

    public String toString() {
        return authorFirstName + " " + authorSecondName;
    }

    public boolean equals(Object other) {
        if ( this.getClass () != other.getClass () ) {
            return false;
        }
        Author author2 = (Author) other;
        return authorSecondName.equals ( author2.authorSecondName ) && authorFirstName.equals ( author2.authorFirstName );
    }

    public int hashCode() {
        return java.util.Objects.hash ( authorFirstName ) + java.util.Objects.hash ( authorSecondName );
    }
}
