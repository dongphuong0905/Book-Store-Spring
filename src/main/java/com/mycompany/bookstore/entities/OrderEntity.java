package com.mycompany.bookstore.entities;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "order")
public class OrderEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity userOrder;

    @OneToOne
    @JoinColumn(name = "oder_status_id")
    private OrderStatusEntity orderStatus;

    @Column(name = "order_date",nullable = false)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Temporal(TemporalType.DATE)
    private Date oderDate;

    @Column(name = "total_price")
    private double totalPrice;

    @OneToOne
    @JoinColumn(name = "payemnt_method")
    private PaymentMethodEntity paymentMethod;

    private double paymentStatus;

    @Column(name = "order_address")
    private String orderAddress;

    //mapping

    @OneToMany(mappedBy = "orderDetail")
    private List<OrderDetailEntity> orderDetails;




}
