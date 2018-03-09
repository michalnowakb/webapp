package io.exogroup.libraryapp.bookcontroller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public List<Book> getallBooks(String topicId) {
        List<Book> books = new ArrayList<>();
        bookRepository.findByTopicId(topicId).forEach(books::add);
        return books;
    }

    public Optional<Book> getBook(String id) {
        return bookRepository.findById(id);
    }


    public void addBook(Book book) {
        bookRepository.save(book);
    }

    public void updateBook(Book book) {
        bookRepository.save(book);

    }

    public void deleteBook(String id) {
        bookRepository.deleteById(id);

    }
}


