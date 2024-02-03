package com.n20dcat054.websellingphone.entity;

import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Id")
    Integer id;
    @Column(name="Name")
    String name;
    @Column(name="UnitPrice")
    Double unitPrice;
    @Column(name="Image")
    String image;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "MM/dd/yyyy")
    @Column(name="ProductDate")
    Date productDate;
    @Column(name="Available")
    Boolean available;
    //Integer categoryId;
    @Column(name="Quantity")
    Integer quantity;
    @Column(name="Description")
    String description;
    @Column(name="Discount")
    Double discount;
    @Column(name="ViewCount")
    Integer viewCount;
    @Column(name="Special")
    Boolean special;

    @ManyToOne
    @JoinColumn(name="categoryId")
    Category category;


    @OneToMany(mappedBy = "product")
    List<OrderDetail> orderDetails;


    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public Double getUnitPrice() {
        return unitPrice;
    }


    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }


    public String getImage() {
        return image;
    }


    public void setImage(String image) {
        this.image = image;
    }


    public Date getProductDate() {
        return productDate;
    }


    public void setProductDate(Date productDate) {
        this.productDate = productDate;
    }


    public Boolean getAvailable() {
        return available;
    }


    public void setAvailable(Boolean available) {
        this.available = available;
    }


    public Integer getQuantity() {
        return quantity;
    }


    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }


    public String getDescription() {
        return description;
    }


    public void setDescription(String description) {
        this.description = description;
    }


    public Double getDiscount() {
        return discount;
    }


    public void setDiscount(Double discount) {
        this.discount = discount;
    }


    public Integer getViewCount() {
        return viewCount;
    }


    public void setViewCount(Integer viewCount) {
        this.viewCount = viewCount;
    }


    public Boolean getSpecial() {
        return special;
    }


    public void setSpecial(Boolean special) {
        this.special = special;
    }


    public Category getCategory() {
        return category;
    }


    public void setCategory(Category category) {
        this.category = category;
    }


    public List<OrderDetail> getOrderDetails() {
        return orderDetails;
    }


    public void setOrderDetails(List<OrderDetail> orderDetails) {
        this.orderDetails = orderDetails;
    }


}
