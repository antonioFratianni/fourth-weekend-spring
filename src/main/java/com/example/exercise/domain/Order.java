package com.example.exercise.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "orders")
public class Order {

    @Id
    private String id;
    private String clientRef;

    public Order() {}

    public Order(String clientRef) {
        this.clientRef = clientRef;
    }

    public Order(String id, String clientRef) {
        this.id = id;
        this.clientRef = clientRef;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getClientRef() {
        return clientRef;
    }

    public void setClientRef(String clientRef) {
        this.clientRef = clientRef;
    }
}
