package com.mycompany.bookstore.entities;

import javax.persistence.*;

@Entity
@Table(name = "promotion")
public class PublisherEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, name = "publisher_name")
    private String publsherName;


}
