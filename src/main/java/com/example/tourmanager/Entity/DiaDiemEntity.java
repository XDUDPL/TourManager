package com.example.tourmanager.Entity;

import javax.persistence.*;

@Entity
@Table(name = "diadiem")
public class DiaDiemEntity extends BaseEntity{

    @Column(name = "dd_thanhpho")
    private String thanhPho;

    @Column(name = "dd_ten")
    private String ten;

    @Column(name = "dd_mota")
    private String moTa;

    @ManyToOne(fetch = FetchType.LAZY)
    private ChiTietTourEntity chiTietTour;

    public ChiTietTourEntity getChiTietTour() {
        return chiTietTour;
    }

    public void setChiTietTour(ChiTietTourEntity chiTietTour) {
        this.chiTietTour = chiTietTour;
    }

    public String getThanhPho() {
        return thanhPho;
    }

    public void setThanhPho(String thanhPho) {
        this.thanhPho = thanhPho;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }
}
