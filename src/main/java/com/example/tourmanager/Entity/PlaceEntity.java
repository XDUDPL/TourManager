package com.example.tourmanager.Entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "place")
public class PlaceEntity extends BaseEntity {

    @Column(name = "name")
    private String name;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinTable(name = "tour_place",
                joinColumns = @JoinColumn(name ="place_id"),
                inverseJoinColumns = @JoinColumn(name = "tour_id")
    )
    private List<TourEntity> tours = new ArrayList<>();
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
