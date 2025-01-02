package BehaviouralPatterns.Iterator;

import java.util.Iterator;

public class Main {
    public static void main(String[] args){
        BookCollection bookCollection = new BookCollection();
        bookCollection.addBook(new Book("c++", "monishreddy"));
        bookCollection.addBook(new Book("python", "varuntejreddy"));

        Iterator<Book> bookIterator = bookCollection.getIterator();

        while(bookIterator.hasNext()){
            Book nextBook = bookIterator.next();
            System.out.println(nextBook.getBookDetails());
        }
    }
}
