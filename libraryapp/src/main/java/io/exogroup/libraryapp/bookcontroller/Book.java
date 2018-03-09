package io.exogroup.libraryapp.bookcontroller;

import io.exogroup.libraryapp.topiccontroller.Topic;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Book {

    @Id
    private String id;
    private String title;
    private String author;
    private String type;
    private String description;
    /*
    id: lotr
    title: The Lord of the Rings - The Fellowship of the Ring
    author: J. R. R. Tolkien
    type: Fantasy,Adventure
    description: The Lord of the Rings is an epic high fantasy novel written by English author and scholar J. R. R. Tolkien.
    The story began as a sequel to Tolkien's 1937 fantasy novel The Hobbit, but eventually developed into a much larger work.
    Written in stages between 1937 and 1949, The Lord of the Rings is one of the best-selling novels ever written, with over 150 million copies sold

     */

    @ManyToOne
    private Topic topic;

    public Book()
    {

    }

    public Book(String id, String title,String author, String type, String description, String topicId) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.type = type;
        this.description = description;
        this.topic = new Topic(topicId, "", "");
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Topic getTopic() {
        return topic;
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
    }






}
