package com.example.esericizo23092024.esercizioLive.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import org.springframework.data.annotation.Id;

import java.util.List;

@Entity
public class Customer {
    @Id
    private Long id;
    //@Column(name="name")
    private String name;
    private String email;
    @OneToMany(mappedBy = "customer") //collegamento alla tabella degli ordini (foreign key)
    private List<Order> orderList;

    public Customer(Long id, String name, String email, List<Order> orderList) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.orderList = orderList;
    }

    public Customer() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }
}
