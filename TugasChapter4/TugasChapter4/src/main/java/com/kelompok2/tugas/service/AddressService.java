package com.kelompok2.tugas.service;

import com.kelompok2.tugas.model.Address;
import com.kelompok2.tugas.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {
    
    @Autowired
    AddressRepository addressRepository;

    public List<Address> getAllAddress() {
        return addressRepository.findAll();
    }

    public Address getAddressById(Integer address_id) {
        return addressRepository.findById(address_id).get();
    }

    public void deleteAddress(Integer address_id) {
        addressRepository.deleteById(address_id);
    }

    


    
}
