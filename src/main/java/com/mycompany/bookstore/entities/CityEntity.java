package com.mycompany.bookstore.entities;

import javax.persistence.*;

@Entity
@Table(name = "city_name")
public class CityEntity {

    @Id
    private String id;

    @Column(nullable = false, name = "city_name")
    private String cityName;

    @Column(nullable = false, name = "city_type")
    private String cityType;
}
