package com.example.tourmanager.Entity;

import javax.persistence.*;

@Entity
@Table(name ="tour")
public class TourEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "tourCode")
    private String tourCode;

    @Column(name = "typetourid")
    private Long typeTourId;

    @Column(name = "name")
    private String name;

    @Column(name = "price")
    private Long price;

    @Column(name = "description",columnDefinition = "TEXT")
    private String description;

    public String getTourCode() {
        return tourCode;
    }

    public void setTourCode(String tourCode) {
        this.tourCode = tourCode;
    }

    public Long getTypeTourId() {
        return typeTourId;
    }

    public void setTypeTourId(Long typeTourId) {
        this.typeTourId = typeTourId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
