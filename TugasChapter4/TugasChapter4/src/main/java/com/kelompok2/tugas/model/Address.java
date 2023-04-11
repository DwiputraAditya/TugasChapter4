package com.kelompok2.tugas.model;

import javax.persistence.*;

import java.awt.*;
import java.util.Date;

@Entity
@Table(name = "address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int address_id;
    
    @Column(name = "address")
    public String address;

    @Column(name = "address2")
    private String address2;

    @Column(name = "district")
    private String district;

    @Column(name = "city_id")
    private int city_id;

    @Column(name = "postal_code")
    private String postal_code;

    @Column(name = "phone")
    private String phone;

    @Column(name = "location")
    private Point location;

    @Column(name = "last_update")
    private Date last_update;

    
}