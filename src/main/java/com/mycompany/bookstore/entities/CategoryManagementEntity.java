package com.mycompany.bookstore.entities;

import javax.persistence.*;
import java.util.List;


@Entity
public class CategoryManagementEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "book_id")
    private BookEntity book;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private CategoryEntity category;

    public BookEntity getBook() {
        return book;
    }

    public void setBook(BookEntity book) {
        this.book = book;
    }

    public CategoryEntity getCategory() {
        return category;
    }

    public void setCategory(CategoryEntity category) {
        this.category = category;
    }

    public CategoryManagementEntity() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public BookEntity getBookEntity() {
        return book;
    }

    public void setBookEntity(BookEntity bookEntity) {
        this.book = bookEntity;
    }

    public CategoryEntity getListCategory() {
        return category;
    }

    public void setListCategory(CategoryEntity categoryEntity) {
        this.category = categoryEntity;
    }
}
