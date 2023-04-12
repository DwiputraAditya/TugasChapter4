package com.kelompok2.tugas.controller;

import com.kelompok2.tugas.model.Address;
import com.kelompok2.tugas.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/kelompok2chp4/")
@RestController
public class AddressController {
    @Autowired
    AddressService addressService;

    @PostMapping("/addAddress")
    public ResponseEntity<Address> addAddress(@RequestBody Address address) {
        Address address1 = addressService.addAddress(address);
        return new ResponseEntity<Address>(address1, HttpStatus.CREATED);
    }

    //    read
    @GetMapping("/getAddress")
    public ResponseEntity<List<Address>> getAddress() {
        List<Address> addresses = addressService.getAllAddress();
        return ResponseEntity.ok(addresses);
    }

    @PutMapping("/updateAddress")
    public ResponseEntity<String> updateAddress(@RequestParam(name = "addressId") Integer id, @RequestBody Address address) {
        addressService.updateAddress(id, address);
        return ResponseEntity.ok("Data berhasil di update");
    }

    @DeleteMapping("/deleteAddress")
    public ResponseEntity<String> deleteAddress(@RequestParam(name = "addressId") Integer id) {
        addressService.deleteAddress(id);
        return ResponseEntity.ok("Data Berhasil dihapus");
    }
}