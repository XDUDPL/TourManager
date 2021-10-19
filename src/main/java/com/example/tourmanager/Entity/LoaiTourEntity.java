package com.example.tourmanager.Entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "loaitour")
public class LoaiTourEntity extends BaseEntity{
    @Column(name = "tenloaitour")
    private String tenLoaiTour;

    @Column(name = "mota")
    private String moTa;

    @OneToMany(
            mappedBy = "loaitour",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<TourEntity> tours = new ArrayList<>();

    public List<TourEntity> getTours() {
        return tours;
    }

    public void setTours(List<TourEntity> tours) {
        this.tours = tours;
    }

    public String getTenLoaiTour() {
        return tenLoaiTour;
    }

    public void setTenLoaiTour(String tenLoaiTour) {
        this.tenLoaiTour = tenLoaiTour;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }
}
