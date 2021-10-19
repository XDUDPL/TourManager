package com.example.tourmanager.Entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "chitiettour")
public class ChiTietTourEntity extends BaseEntity {
    @Column(name = "thutudiadiem")
    private Long thuTu;

    @OneToOne(fetch = FetchType.LAZY)
    private TourEntity tour;

    @OneToMany(
            mappedBy = "chiTietTour",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<DiaDiemEntity> diaDiem = new ArrayList<>();

    public TourEntity getTour() {
        return tour;
    }

    public void setTour(TourEntity tour) {
        this.tour = tour;
    }

    public List<DiaDiemEntity> getDiaDiem() {
        return diaDiem;
    }

    public void setDiaDiem(List<DiaDiemEntity> diaDiem) {
        this.diaDiem = diaDiem;
    }

    public Long getThuTu() {
        return thuTu;
    }

    public void setThuTu(Long thuTu) {
        this.thuTu = thuTu;
    }
}
