package com.mycompany.bookstore.entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class ServiceTypeEntity {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, length = 1000)
    private String description;

    @OneToMany(mappedBy = "service")
    private List<ServiceEntity> serviceList;

    public ServiceTypeEntity() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<ServiceEntity> getServiceList() {
        return serviceList;
    }

    public void setServiceList(List<ServiceEntity> serviceList) {
        this.serviceList = serviceList;
    }
}
