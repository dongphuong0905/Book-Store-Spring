package com.mycompany.bookstore.entities;


import javax.persistence.*;

@Entity
@Table(name = "order_detail")
public class OrderDetailEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private OrderEntity orderDetail;

    @ManyToOne
    @JoinColumn(name = "book_id")
    private BookEntity bookOrderDetail;

    @OneToOne
    @JoinColumn(name = "promotion_id")
    private PromotionEntity promotion;

    private double price;

    private int amount;

    private double total;


}
