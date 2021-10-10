package com.example.tourmanager.Entity;

import javax.persistence.*;

@Entity
@Table(name ="typetour")
public class TypeTourEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
