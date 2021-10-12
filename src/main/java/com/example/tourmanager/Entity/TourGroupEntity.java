package com.example.tourmanager.Entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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

    @OneToMany(
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    @JoinColumn(name = "tourgourp_id")
    private List<CostEntity> costs = new ArrayList<>();

    @ManyToMany(mappedBy = "tourGroups")
    private List<TouristEntity> tourists = new ArrayList<>();

    @ManyToMany(mappedBy = "tourGroups")
    private List<StaffEntity> staffs = new ArrayList<>();

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

}
