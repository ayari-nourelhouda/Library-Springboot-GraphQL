package com.projectLib.GraphQLLibrary.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@NoArgsConstructor
@Setter
@Getter
@Table
@Entity
public class Book {

    @Id
    private int id;
    private String title;
    private String publisher;
    private String[] authors;
    private String publishedDate;

    @Autowired
    public Book(int id, String title, String publisher, String[] authors, String publishedDate) {
        this.id=id;
        this.title=title;
        this.publisher=publishedDate;
        this.publisher=publisher;
        this.authors=authors;
    }
}