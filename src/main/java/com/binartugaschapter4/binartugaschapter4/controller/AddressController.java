package com.binartugaschapter4.binartugaschapter4.controller;

import java.util.List;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.binartugaschapter4.binartugaschapter4.exception.ResourceNotFoundException;
import com.binartugaschapter4.binartugaschapter4.models.Address;
import com.binartugaschapter4.binartugaschapter4.repository.AddressRepository;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/")
public class AddressController {

    @Autowired
    private AddressRepository addressRepository;

    @GetMapping("/")
    public String index() {
        return "address";
    }

    @GetMapping("/address")
    public List<Address> getAllAddress() {
        return addressRepository.findAll();
    }

    @GetMapping("/address/{address_id}")
    public ResponseEntity<Address> getAddressById(@PathVariable Long address_id) {
        Address address = addressRepository.findById(address_id)
                .orElseThrow(() -> new ResourceNotFoundException("Address not exist with id :" + address_id));
        return ResponseEntity.ok(address);
    }

}