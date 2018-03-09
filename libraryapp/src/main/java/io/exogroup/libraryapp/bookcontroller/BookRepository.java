package io.exogroup.libraryapp.bookcontroller;


import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BookRepository extends CrudRepository<Book, String>{

    public List<Book> findByTopicId(String topicId);

}
