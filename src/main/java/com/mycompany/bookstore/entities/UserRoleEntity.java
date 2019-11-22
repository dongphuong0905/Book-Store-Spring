package com.mycompany.bookstore.entities;

import javax.persistence.*;

@Entity
public class UserRoleEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(length = 5)
    private String role;
}
