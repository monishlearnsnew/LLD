package BehaviouralPatterns.Iterator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Iterator;

public class BookCollection {
    public List<Book> books;

    public BookCollection(){
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        this.books.add(book);
    }

    public List<Book> getBooks(){
        return books;
    }

    public BookIterator getIterator() {
        BookIterator bookIterator = new BookIterator(books);
        return bookIterator;
    }

    private class BookIterator implements Iterator<Book> {
        private List<Book> books;

        private int position;

        public BookIterator(List<Book> books){
            this.books = books;
            this.position =0;
        }

        @Override
        public boolean hasNext() {
            return position < books.size();
        }

        @Override
        public Book next() {
            this.position = position+1;
            return books.get(this.position-1);
        }
        
    }

}
