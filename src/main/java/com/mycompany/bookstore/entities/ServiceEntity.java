package com.mycompany.bookstore.entities;

import javax.persistence.*;

@Entity
public class ServiceEntity {

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ServiceEntity() {
    }

    public ServiceTypeEntity getService() {
        return service;
    }

    public void setService(ServiceTypeEntity service) {
        this.service = service;
    }

    public BookEntity getBookSerivce() {
        return bookSerivce;
    }

    public void setBookSerivce(BookEntity bookSerivce) {
        this.bookSerivce = bookSerivce;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "service_type_id")
    private ServiceTypeEntity service;

    @ManyToOne
    @JoinColumn(name = "book_id")
    private BookEntity bookSerivce;


}
