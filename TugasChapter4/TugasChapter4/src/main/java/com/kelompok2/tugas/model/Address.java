package com.kelompok2.tugas.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.awt.*;
import java.util.Date;

@Entity
@Data
public class Address {
    @Id
    private int address_id;
    private String address;
    private String address2;
    private String district;
    private int city_id;
    private String postal_code;
    private String phone;
    private Point location;
    private Date last_update;

}
