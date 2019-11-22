package com.mycompany.bookstore.entities;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class BookEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @JoinColumn(name="publisher_id")
    private PublisherEntity publisher;

    @Column(nullable = false, length = 50)
    private String author;

    @Column(nullable = false, length = 100)
    private String title;

    @Column(nullable = false, length = 5000)
    private String description;

    @Column(name = "publish_date",nullable = false)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Temporal(TemporalType.DATE)
    private Date publishDate;

    private double price;

    private int amount;

    @JoinColumn(name = "promotion_id")
    private PromotionEntity promotion;

    //mapping
    @OneToMany(mappedBy = "book", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<CategoryManagementEntity> categoryManagements;

    @OneToMany(mappedBy = "bookSerivce",cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ServiceTypeEntity> serviceType;

    @OneToMany(mappedBy = "bookReview",cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ReviewEntity> reviews;

    @OneToMany(mappedBy = "bookImage",cascade = CascadeType.ALL, orphanRemoval = true)
    private List<BookImageEntity> images;

    public BookEntity() {
    }

    public List<CategoryManagementEntity> getCategoryManagements() {
        return categoryManagements;
    }

    public void setCategoryManagements(List<CategoryManagementEntity> categoryManagements) {
        this.categoryManagements = categoryManagements;
    }

    public List<ServiceTypeEntity> getServiceType() {
        return serviceType;
    }

    public void setServiceType(List<ServiceTypeEntity> serviceType) {
        this.serviceType = serviceType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public PublisherEntity getPublisher() {
        return publisher;
    }

    public void setPublisher(PublisherEntity publisher) {
        this.publisher = publisher;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public PromotionEntity getPromotion() {
        return promotion;
    }

    public void setPromotion(PromotionEntity promotion) {
        this.promotion = promotion;
    }


}
