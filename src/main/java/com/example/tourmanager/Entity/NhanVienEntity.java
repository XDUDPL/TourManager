package com.example.tourmanager.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "nhanvien")
public class NhanVienEntity extends BaseEntity {
    @Column(name = "nv_ten")
    private String nvTen;

    @Column(name = "nv_sdt")
    private String nvSDT;

    @Column(name = "nv_ngaysinh")
    private Date nvNgaySinh;

    @Column(name = "nv_email")
    private String nvEmail;

    @Column(name = "nv_cmnd")
    private String nvCMND;

    @Column(name = " nv_nhiemvu ")
    private String nvNhiemVu;

    public String getNvTen() {
        return nvTen;
    }

    public void setNvTen(String nvTen) {
        this.nvTen = nvTen;
    }

    public String getNvSDT() {
        return nvSDT;
    }

    public void setNvSDT(String nvSDT) {
        this.nvSDT = nvSDT;
    }

    public Date getNvNgaySinh() {
        return nvNgaySinh;
    }

    public void setNvNgaySinh(Date nvNgaySinh) {
        this.nvNgaySinh = nvNgaySinh;
    }

    public String getNvEmail() {
        return nvEmail;
    }

    public void setNvEmail(String nvEmail) {
        this.nvEmail = nvEmail;
    }

    public String getNvCMND() {
        return nvCMND;
    }

    public void setNvCMND(String nvCMND) {
        this.nvCMND = nvCMND;
    }

    public String getNvNhiemVu() {
        return nvNhiemVu;
    }

    public void setNvNhiemVu(String nvNhiemVu) {
        this.nvNhiemVu = nvNhiemVu;
    }
}
