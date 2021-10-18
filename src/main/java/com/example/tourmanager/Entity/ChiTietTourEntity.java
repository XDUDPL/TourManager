package com.example.tourmanager.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "chitiettour")
public class ChiTietTourEntity extends BaseEntity {
    @Column(name = "thutudiadiem")
    private Long thuTu;

    public Long getThuTu() {
        return thuTu;
    }

    public void setThuTu(Long thuTu) {
        this.thuTu = thuTu;
    }
}
