package com.mycompany.bookstore.entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class CategoryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    public List<CategoryManagementEntity> getCategoryManagements() {
        return categoryManagements;
    }

    public void setCategoryManagements(List<CategoryManagementEntity> categoryManagements) {
        this.categoryManagements = categoryManagements;
    }

    @Column(nullable = false)
    private String description;

    @OneToMany(mappedBy = "category")
    private List<CategoryManagementEntity> categoryManagements;

    public CategoryEntity() {
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
}
