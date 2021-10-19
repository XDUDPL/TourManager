package com.example.tourmanager.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "loaichiphi")
public class LoaiChiPhiEntity extends BaseEntity{

    @Column(name = "cp_ten")
    private String cpTen;

    public String getCpTen() {
        return cpTen;
    }

    public void setCpTen(String cpTen) {
        this.cpTen = cpTen;
    }

    public String getCpMoTa() {
        return cpMoTa;
    }

    public void setCpMoTa(String cpMoTa) {
        this.cpMoTa = cpMoTa;
    }

    @Column(name="cp_mota")
    private String cpMoTa;


}
