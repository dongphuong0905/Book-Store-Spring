package com.mycompany.bookstore.entities;

import javax.persistence.*;

@Entity
@Table(name = "book_image")
public class BookImageEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "book_id")
    private BookEntity bookImage;

    @Column(length = 1000)
    private String description;
}
