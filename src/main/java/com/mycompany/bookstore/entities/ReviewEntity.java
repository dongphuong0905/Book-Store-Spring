package com.mycompany.bookstore.entities;

import org.apache.catalina.User;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "review")
public class ReviewEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "book_id", nullable = false)
    private BookEntity bookReview;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private UserEntity userReview;


    @Column(name = "number_rate", nullable = false)
    private int numberRate;

    @Column(length = 1000, nullable = false)
    private String title;

    @Column(length = 5000, nullable = false)
    private String comment;

    @Column(name = "review_date",nullable = false)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Temporal(TemporalType.DATE)
    private Date reviewDate;

    private int visible;


}
