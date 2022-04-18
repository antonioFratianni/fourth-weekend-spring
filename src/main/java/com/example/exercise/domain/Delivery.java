package com.example.exercise.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "delivery")
public class Delivery {
    @Id
    private String id;
    private String address;
    private String CAP;

    public Delivery(){}

    public Delivery(String address, String CAP) {
        this.address = address;
        this.CAP = CAP;
    }

    public Delivery(String id, String address, String CAP) {
        this.id = id;
        this.address = address;
        this.CAP = CAP;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCAP() {
        return CAP;
    }

    public void setCAP(String CAP) {
        this.CAP = CAP;
    }
}
