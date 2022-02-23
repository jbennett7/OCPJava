import java.util.*;
class Book {}
class Magazine {}

public class Crate<T> {
    private T contents;
    public T emptyCrate() {
        return contents;
    }

    public void packCrate(T contents) {
        this.contents = contents;
    }
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        List<Magazine> magazines = new ArrayList<>();
        for(int i=0;i<3;i++) {
            books.add(new Book());
            magazines.add(new Magazine());
        }
        Crate<Book> oneBook = new Crate<>();
        Crate<List> multiBooks = new Crate<>();
        Crate<List> multiMagazines = new Crate<>();
        oneBook.packCrate(new Book());
        multiBooks.packCrate(multiBooks);
        multiMagazines.packCrate(multiMagazines);
    }
}
