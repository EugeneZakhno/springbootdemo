package io.github.springbootdemo.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Data
@Entity
@Table(name = "books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "serial_number")
    private Long serialNumber;

    @Column(name = "year")
    private int year;

    @Column(name = "lang")
    private String lang;

    @Column(name = "author_name")
    private  String authorName;

    @Column(name = "publishing_company")
    private  String publishingCompany;

    @Column(name = "book_name")
    private String bookName;

    @Column(name = "topic")
    private String topic;

    @Column(name = "link")
    private String link;
}
