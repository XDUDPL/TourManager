package com.example.tourmanager.Entity;

import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name="tourist")
public class TouristEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;

    @Column(name = "touristcode")
    private String touristCode;

    @Column(name = "identityNumber")
    private String identityNumber;

    @Column(name = "name")
    private String name;

    @Column(name = "address")
    private String address;

    @Column(name = "gender")
    private String gender;

    @Column(name = "phone")
    private String phone;

    @Column(name = "dateofbirth")
    private Date dateOfBirth;

    @Column(name = "email")
    private String email;

    public Long getId() {
        return id;
    }


    public String getTouristCode() {
        return touristCode;
    }

    public void setTouristCode(String touristCode) {
        this.touristCode = touristCode;
    }

    public String getIdentityNumber() {
        return identityNumber;
    }

    public void setIdentityNumber(String identityNumber) {
        this.identityNumber = identityNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
