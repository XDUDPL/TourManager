package com.example.tourmanager.Entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tour")
public class TourEntity extends BaseEntity{
    @Column(name = "tour_ten")
    private String tenTour;

    @Column(name = "tour_mota")
    private String moTa;


    @ManyToOne(fetch = FetchType.LAZY)
    private LoaiTourEntity loaitour;

    @OneToMany(
            mappedBy = "tour",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    List<DoanEntity> doans = new ArrayList<>();

    @OneToMany(
            mappedBy = "tour",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    List<GiaTourEntity> gias = new ArrayList<>();

    @OneToMany(
            mappedBy = "tour",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    List<ChiTietTourEntity> chiTietTourEntities = new ArrayList<>();



    public LoaiTourEntity getLoaitour() {
        return loaitour;
    }

    public void setLoaitour(LoaiTourEntity loaitour) {
        this.loaitour = loaitour;
    }

    public String getTenTour() {
        return tenTour;
    }

    public void setTenTour(String tenTour) {
        this.tenTour = tenTour;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }
}
