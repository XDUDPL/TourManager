package com.example.tourmanager.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "chiphi")
public class ChiPhiEntity extends BaseEntity{
    @Column(name = "chiphi_total")
    private Long tongChiphi;

    @Column(name = "chiphi_chitiet")
    private String chiTiet;

    public Long getTongChiphi() {
        return tongChiphi;
    }

    public void setTongChiphi(Long tongChiphi) {
        this.tongChiphi = tongChiphi;
    }

    public String getChiTiet() {
        return chiTiet;
    }

    public void setChiTiet(String chiTiet) {
        this.chiTiet = chiTiet;
    }
}
