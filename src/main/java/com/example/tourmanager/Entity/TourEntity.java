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

    @OneToMany(
            mappedBy = "tour",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<LoaiTourEntity> loaiTourEntities = new ArrayList<>();

    @OneToMany(
            mappedBy = "tour",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<DoanEntity> doans = new ArrayList<>();

    public GiaTourEntity getGiaTour() {
        return giaTour;
    }

    public void setGiaTour(GiaTourEntity giaTour) {
        this.giaTour = giaTour;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    private GiaTourEntity giaTour;

    public List<LoaiTourEntity> getLoaiTourEntities() {
        return loaiTourEntities;
    }

    public void setLoaiTourEntities(List<LoaiTourEntity> loaiTourEntities) {
        this.loaiTourEntities = loaiTourEntities;
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
