package io.exogroup.libraryapp.topiccontroller;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Topic {

    @Id
    private String id; // As a ID we can choose library location
    private String name;
    private String description;

    /*
    Blueprint for Topic
    id = Victoria
    name = Royal Library
    description = Biggest library in London, where you can find paper books,e-books and videos.
     */

    public Topic()
    {

    }

    public Topic(String id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }






}
