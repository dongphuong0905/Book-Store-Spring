package com.mycompany.bookstore.entities;

import javax.persistence.*;

@Entity
@Table(name = "user_role")
public class UserRoleEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(length = 5)
    private String role;
}
