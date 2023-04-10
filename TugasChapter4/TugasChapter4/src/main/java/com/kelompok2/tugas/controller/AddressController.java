package com.kelompok2.tugas.controller;

import com.kelompok2.tugas.model.Address;
import com.kelompok2.tugas.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AddressController {
    @Autowired
    AddressService addressService;

    @DeleteMapping("/deleteAddress")
    public ResponseEntity<String> deleteAddress(@RequestParam(name = "address_id") Integer id){
        addressService.deleteAddress(id);
        return ResponseEntity.ok("Data Berhasil dihapus");
    }

}
