package com.example.tourmanager.Entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "giatour")
public class GiaTourEntity extends BaseEntity{
    @Column(name = "giatour")
    private Long giaTour;

    @Column(name = "ngayapdung")
    private Date ngayApDung;

    @Column(name = "ghichu")
    private String ghiChu;

    @ManyToOne(fetch = FetchType.LAZY)
    private TourEntity tour;

    public TourEntity getTour() {
        return tour;
    }

    public void setTour(TourEntity tour) {
        this.tour = tour;
    }

    public Long getGiaTour() {
        return giaTour;
    }

    public void setGiaTour(Long giaTour) {
        this.giaTour = giaTour;
    }

    public Date getNgayApDung() {
        return ngayApDung;
    }

    public void setNgayApDung(Date ngayApDung) {
        this.ngayApDung = ngayApDung;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }
}
