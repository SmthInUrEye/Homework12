public class Main {

    public static void main(String[] args) {

        Author SKing = new Author ( "Steven", "King" );
        Author JLondon = new Author ( "Jack", "London" );
        Book Misery = new Book ( SKing, 2004, "Moscow" );
        Book TheSeaWolf = new Book ( JLondon, 1904, "The Sea-Wolf" );
        Misery.setPublicationYear ( 1987 );

    }
}

