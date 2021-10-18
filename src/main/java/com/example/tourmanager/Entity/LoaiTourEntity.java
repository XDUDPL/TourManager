package com.example.tourmanager.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "loaitour")
public class LoaiTourEntity extends BaseEntity{
    @Column(name = "tenloaitour")
    private String tenLoaiTour;

    @Column(name = "mota")
    private String moTa;

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
