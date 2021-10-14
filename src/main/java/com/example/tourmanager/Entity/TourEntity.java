package com.example.tourmanager.Entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name ="tour")
public class TourEntity extends BaseEntity{

    @Column(name = "tourCode")
    private String tourCode;

    @Column(name = "name")
    private String name;

    @Column(name = "price")
    private Long price;

    @Column(name = "description",columnDefinition = "TEXT")
    private String description;

    @ManyToMany(mappedBy = "tours")
    private List<PlaceEntity> places = new ArrayList<>();


    @OneToMany(
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    @JoinColumn(name = "tour_id")
    private List<TourGroupEntity> tourGourp = new ArrayList<>();

    public String getTourCode() {
        return tourCode;
    }

    public void setTourCode(String tourCode) {
        this.tourCode = tourCode;
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

    public List<PlaceEntity> getPlaces() {
        return places;
    }

    public void setPlaces(List<PlaceEntity> places) {
        this.places = places;
    }

    public List<TourGroupEntity> getTourGourp() {
        return tourGourp;
    }

    public void setTourGourp(List<TourGroupEntity> tourGourp) {
        this.tourGourp = tourGourp;
    }
}

