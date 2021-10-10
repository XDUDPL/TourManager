package com.example.tourmanager.Entity;

import javax.persistence.*;

@Entity
@Table(name = "cost")
public class CostEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "tourgroupid")
    private String tourGroupId;

    @Column(name = "cost")
    private Long cost;

    @Column(name = "description", columnDefinition = "TEXT")
    private String description;

    public String getTourGroupId() {
        return tourGroupId;
    }

    public void setTourGroupId(String tourGroupId) {
        this.tourGroupId = tourGroupId;
    }

    public Long getCost() {
        return cost;
    }

    public void setCost(Long cost) {
        this.cost = cost;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
