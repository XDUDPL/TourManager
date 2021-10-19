package com.example.tourmanager.Entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "chitiettour")
public class ChiTietTourEntity extends BaseEntity {
    @Column(name = "thutudiadiem")
    private Long thuTu;

    @ManyToOne(fetch = FetchType.LAZY)
    private TourEntity tour;


    @ManyToOne(fetch = FetchType.LAZY)
    private DiaDiemEntity diaDiem;

    public TourEntity getTour() {
        return tour;
    }

    public void setTour(TourEntity tour) {
        this.tour = tour;
    }

    public Long getThuTu() {
        return thuTu;
    }

    public void setThuTu(Long thuTu) {
        this.thuTu = thuTu;
    }
}
