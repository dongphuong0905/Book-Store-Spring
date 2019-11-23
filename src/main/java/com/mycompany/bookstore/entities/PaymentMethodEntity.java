package com.mycompany.bookstore.entities;

import javax.persistence.*;

@Entity
@Table(name = "payment_method")
public class PaymentMethodEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String description;
}
