package com.example.tourmanager.Entity;

import javax.persistence.*;

@Entity
@Table(name = "nguoidi")
public class NguoiDiEntity  extends  BaseEntity{

    @Column(name = "nguoidi_dsnhanvien")
    private String dsNhanVien;

    @Column(name = "nguoidi_dskhachhang")
    private String dsKhachHang;

    @OneToOne(fetch = FetchType.LAZY)
    @MapsId
    private DoanEntity doan;

    public String getDsNhanVien() {
        return dsNhanVien;
    }

    public void setDsNhanVien(String dsNhanVien) {
        this.dsNhanVien = dsNhanVien;
    }

    public String getDsKhachHang() {
        return dsKhachHang;
    }

    public void setDsKhachHang(String dsKhachHang) {
        this.dsKhachHang = dsKhachHang;
    }
}
