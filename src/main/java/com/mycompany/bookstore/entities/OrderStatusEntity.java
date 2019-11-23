package com.mycompany.bookstore.entities;

import javax.persistence.*;

@Entity
@Table(name = "order_status")
public class OrderStatusEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String description;

}
