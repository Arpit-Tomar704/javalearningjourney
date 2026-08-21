package Challenges74;

public class LibraryitemTest {
    static void main(String[] args) {

        Book book = new Book();
        book.checkout();
        book.returnitem();
        System.out.println(book.itemId);
        Magazine magazine = new Magazine();
        magazine.checkout();
        magazine.returnitem();
        System.out.println();


        DVD dvd = new DVD();
        dvd.checkout();
        dvd.returnitem();


    }
}
