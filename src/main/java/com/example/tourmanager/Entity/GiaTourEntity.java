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

    @OneToMany(
            mappedBy = "giaTour",
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
