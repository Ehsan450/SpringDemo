package com.example.product.entity;

import javax.persistence.*;

@Entity
@Table(name = "product")
public class Product {
    @OneToOne
    @JoinColumn(name = "categories_id")
   private Category category;
    @Id
    @Column(name = "product_id")
    private int product_id;
    @Column(name = "product_name")
    private String product_name;
    @Column(name = "specifications")
    private String specifications;
    @Column(name = "stock")
    private int stock;

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Product{" +
                "product_id=" + product_id +
                ", product_name='" + product_name + '\'' +
                ", specifications='" + specifications + '\'' +
                ", stock=" + stock +
                '}';
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getSpecifications() {
        return specifications;
    }

    public void setSpecifications(String specifications) {
        this.specifications = specifications;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
