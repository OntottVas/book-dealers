package hu.progmatic.bookdealers.service;

import hu.progmatic.bookdealers.model.Book;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {

    List<Book>books=new ArrayList<>();

    public BookService() {
        books.add(new Book("The Lord of The Rings", "J. R. R. Tolkien"));
        books.add(new Book("Egri csillagok", "Gárdonyi Géza"));
    }

    public List<Book> getAllBooks() {
        return books;
    }

    public void addBook(Book book){
        books.add(new Book());
    }

}
