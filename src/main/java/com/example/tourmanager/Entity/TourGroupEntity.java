package com.example.tourmanager.Entity;

import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name = "tourgroup")
public class TourGroupEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "tourgroupcode")
    private String tourGroupCode;

    @Column(name = "name")
    private String name;

    @Column(name = "begindate")
    private Date beginDate;

    @Column(name = "enddate")
    private Date endDate;

    @Column(name = "description",columnDefinition = "Text")
    private String description;

    @Column(name = "tourid")
    private Long tourId;

    @Column(name = "staffid")
    private Long staffId;

    public String getTourGroupCode() {
        return tourGroupCode;
    }

    public void setTourGroupCode(String tourGroupCode) {
        this.tourGroupCode = tourGroupCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getTourId() {
        return tourId;
    }

    public void setTourId(Long tourId) {
        this.tourId = tourId;
    }

    public Long getStaffId() {
        return staffId;
    }

    public void setStaffId(Long staffId) {
        this.staffId = staffId;
    }
}
