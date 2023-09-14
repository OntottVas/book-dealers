package service;

import model.Book;
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
    public void getAllBooks(){
        System.out.println(books);
    }
    public void addBook(String bookTitle, String author){
        books.add(new Book());
    }

}
