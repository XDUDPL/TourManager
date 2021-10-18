package com.example.tourmanager.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "giatour")
public class GiaTourEntity extends BaseEntity{
    @Column(name = "giatour")
    private Long giaTour;

    @Column(name = "ngayapdung")
    private Date ngayApDung;

    @Column(name = "ghichu")
    private String ghiChu;

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
