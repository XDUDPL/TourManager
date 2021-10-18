package com.example.tourmanager.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "khachhang")
public class KhachHangEntity extends BaseEntity {
    @Column(name = "kh_ten")
    private String khTen;

    @Column(name = "kh_sdt")
    private String khSDT;

    @Column(name = "kh_ngaysinh")
    private Date khNgaySinh;

    @Column(name = "kh_email")
    private String khEmail;

    @Column(name = "kh_cmnd")
    private String khCMND;

    public String getKhTen() {
        return khTen;
    }

    public void setKhTen(String khTen) {
        this.khTen = khTen;
    }

    public String getKhSDT() {
        return khSDT;
    }

    public void setKhSDT(String khSDT) {
        this.khSDT = khSDT;
    }

    public Date getKhNgaySinh() {
        return khNgaySinh;
    }

    public void setKhNgaySinh(Date khNgaySinh) {
        this.khNgaySinh = khNgaySinh;
    }

    public String getKhEmail() {
        return khEmail;
    }

    public void setKhEmail(String khEmail) {
        this.khEmail = khEmail;
    }

    public String getKhCMND() {
        return khCMND;
    }

    public void setKhCMND(String khCMND) {
        this.khCMND = khCMND;
    }
}
