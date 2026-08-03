package Challenges;

import java.awt.print.Book;

class cha45_Book {
    static  int totalNoofBooks;
    String author;
    String title;
    String isbn;

    boolean isBorrowed;


    static {
        totalNoofBooks=0;
    }
     {//object init
         totalNoofBooks++;
     }


    cha45_Book(String isbn, String title, String author){
        this.isbn = isbn;
        this.title=title;
        this.author = author;

    }
   cha45_Book(String isbn){
        this(isbn,"unknown","unknown");
   }
   static int getTotalNoofBooks(){
        return totalNoofBooks;
   }
   void borrowBook(){
        if(isBorrowed){
            System.out.println("Book is already borrowed");
        }else{
            this.isBorrowed = true;
            System.out.println("Enjoy " + this.title);
        }

   }

    void returnBook(){
        if(isBorrowed){
            this.isBorrowed = false;
            System.out.println("Hope you Enjoyed ,please leave the review");
        }else{
            System.out.println("This book is already in the library ");
        }
    }

     static void main(String[] args) {
          cha45_Book designofthings = new cha45_Book("1","Design","Author");
          cha45_Book mybook = new cha45_Book("2");
         System.out.println(cha45_Book.getTotalNoofBooks());
         designofthings.borrowBook();
         mybook.borrowBook();
         designofthings.borrowBook();
         designofthings.returnBook();
         designofthings.returnBook();



     }



}
