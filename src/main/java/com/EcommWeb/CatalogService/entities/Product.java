package com.EcommWeb.CatalogService.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Product {
    @Id
    @GeneratedValue
    private Integer Id;
    @Column(name = "title")
    private String title;

    private String description;

    @Column(name = "price",columnDefinition = "float default 0 ")
    private float price;

    public Product() {
    }

    public Product(String title, String description, float price) {
        this.title = title;
        this.description = description;
        this.price = price;
    }

    public Integer getId() {
        return Id;
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

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
