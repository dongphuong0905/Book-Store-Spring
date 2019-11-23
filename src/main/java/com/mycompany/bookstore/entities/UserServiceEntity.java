package com.mycompany.bookstore.entities;

import javax.persistence.*;

@Entity
@Table(name = "user_service")
public class UserServiceEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToOne
    @JoinColumn(name = "user_id")
    private UserEntity user;

    @Column(name = "cover_number",nullable = false)
    private int coverNumber;

    @Column(name = "bookmark_number",nullable = false)
    private int bookmarkNumber;
}
