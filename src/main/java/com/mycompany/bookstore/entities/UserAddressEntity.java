package com.mycompany.bookstore.entities;

import javax.persistence.*;

@Entity
@Table(name = "user_address")
public class UserAddressEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToOne
    @JoinColumn(name = "user_id")
    private UserEntity user;

    @OneToOne
    @JoinColumn(name = "city_id")
    private CityEntity city;

    @Column(length = 100)
    private String address;
}
