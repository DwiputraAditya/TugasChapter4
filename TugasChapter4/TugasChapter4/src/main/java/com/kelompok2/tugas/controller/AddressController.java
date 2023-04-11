package com.kelompok2.tugas.controller;

import com.kelompok2.tugas.model.Address;
import com.kelompok2.tugas.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/kelompok2chp4/")
public class AddressController {
    @Autowired
    AddressService addressService;

    @GetMapping("/")
    public ResponseEntity<String> index(){
        return ResponseEntity.ok("Kelompok 2");
    }

    @GetMapping("/address")
    public ResponseEntity<List<Address>> getAllAddress(){
        List<Address> addressList = addressService.getAllAddress();
        return ResponseEntity.ok(addressList);
    }

    @GetMapping("/address/{address_id}")
    public ResponseEntity<Address> getAddressById(@RequestParam(name = "address_id") Integer address_id){
        Address address = addressService.getAddressById(address_id);
        return ResponseEntity.ok(address);
    }

    @DeleteMapping("/address/{address_id}")
    public ResponseEntity<String> deleteAddress(@RequestParam(name = "address_id") Integer address_id){
        addressService.deleteAddress(address_id);
        return ResponseEntity.ok("Data Berhasil dihapus");
    }

}
