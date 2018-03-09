package io.exogroup.libraryapp.bookcontroller;


import io.exogroup.libraryapp.topiccontroller.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    @RequestMapping("/topics/{id}/books")
    public List<Book> getAllCourse(@PathVariable String id)
    {
     return bookService.getallBooks(id);
    }

    @RequestMapping("/topics/{topicId}/books/{id}")
    public Optional<Book> getBook(@PathVariable String id) {
        return bookService.getBook(id);
    }

    @RequestMapping(method = RequestMethod.POST, value="/topics/{topicId}/books")
    public void addBook(@RequestBody Book book, @PathVariable String topicId){
        book.setTopic(new Topic(topicId , "", ""));
        bookService.addBook(book);
    }

    @RequestMapping(method = RequestMethod.PUT, value="/topics/{topicId}/books/{id}")
    public void updateBook(@RequestBody Book book, @PathVariable String topicId, @PathVariable String id){
        book.setTopic(new Topic(topicId , "", ""));
        bookService.updateBook(book);
    }

    @RequestMapping(method = RequestMethod.DELETE, value="/topics/{topicId}/books/{id}")
    public void deleteBook(@PathVariable String id) {
        bookService.deleteBook(id);
    }

}
