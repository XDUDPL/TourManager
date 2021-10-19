package com.example.tourmanager.Entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "doan")
public class DoanEntity extends BaseEntity {
    @Column(name = "doan_ten")
    private String tenDoan;

    @Column(name ="doan_ngaydi")
    private Date ngayDi;

    @Column(name = "doan_ngayve")
    private Date ngayVe;

    @Column(name = "doan_chitietCT")
    private String chiTietChuongTrinh;

    @ManyToOne(fetch = FetchType.LAZY)
    private TourEntity tour;

    public TourEntity getTour() {
        return tour;
    }

    public void setTour(TourEntity tour) {
        this.tour = tour;
    }

    public String getTenDoan() {
        return tenDoan;
    }

    public void setTenDoan(String tenDoan) {
        this.tenDoan = tenDoan;
    }

    public Date getNgayDi() {
        return ngayDi;
    }

    public void setNgayDi(Date ngayDi) {
        this.ngayDi = ngayDi;
    }

    public Date getNgayVe() {
        return ngayVe;
    }

    public void setNgayVe(Date ngayVe) {
        this.ngayVe = ngayVe;
    }

    public String getChiTietChuongTrinh() {
        return chiTietChuongTrinh;
    }

    public void setChiTietChuongTrinh(String chiTietChuongTrinh) {
        this.chiTietChuongTrinh = chiTietChuongTrinh;
    }
}
