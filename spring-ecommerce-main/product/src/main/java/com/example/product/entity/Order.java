package com.example.product.entity;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "orders")
public class Order {
    //foreignkey needs to be added
    @OneToOne
    @JoinColumn(name = "product_id")
   private Product product;
    @Id
    @Column(name = "order_id")
    private int orderId;
    @Column(name = "quantity")
    private int quantity;
    @Column(name = "ordered_on")
    private Date orderedOn;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        orderId = orderId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        quantity = quantity;
    }

    public Date getOrderedOn() {
        return orderedOn;
    }

    public void setOrderedOn(Date orderedOn) {
        orderedOn = orderedOn;
    }
}
