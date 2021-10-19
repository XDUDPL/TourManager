package com.example.tourmanager.Entity;

import javax.persistence.*;

@Entity
@Table(name = "loaitour")
public class LoaiTourEntity extends BaseEntity{
    @Column(name = "tenloaitour")
    private String tenLoaiTour;

    @Column(name = "mota")
    private String moTa;

    @ManyToOne(fetch = FetchType.LAZY)
    private TourEntity tour;

    public TourEntity getTour() {
        return tour;
    }

    public void setTour(TourEntity tour) {
        this.tour = tour;
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
