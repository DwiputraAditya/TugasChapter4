package com.kelompok2.tugas.model;

import lombok.Data;

import javax.persistence.*;

import java.awt.*;
import java.util.Date;

@Entity
@Data
@Table(name = "address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int addressId;
    
    @Column(name = "address")
    public String address;

    @Column(name = "address2")
    private String address2;

    @Column(name = "district")
    private String district;

    @Column(name = "city_id")
    private int cityId;

    @Column(name = "postal_code")
    private String postalCode;

    @Column(name = "phone")
    private String phone;

    @Column(name = "location")
    private Point location;

    @Column(name = "last_update")
    private Date lastUpdate;
}