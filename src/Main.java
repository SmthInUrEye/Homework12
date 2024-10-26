public class Main {

    public static void main(String[] args) {

        Author SKing = new Author ( "Steven", "King" );
        Author JLondon = new Author ( "Jack", "London" );
        Author JKing = new Author ( "Steven", "King" );
        Book Misery = new Book ( SKing, 2004, "Misery" );
        Book TheSeaWolf = new Book ( JLondon, 1904, "The Sea-Wolf" );
        Book Misery2 = new Book ( SKing, 1987, "Misery" );
        Misery.setPublicationYear ( 1987 );

    }
}

