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

    public Address addAddress(Address address) {
        return addressRepository.save(address);
    }

    public List<Address> getAllAddress() {
        return addressRepository.findAll();
    }

    public Address updateAddress(Integer id, Address address) {
        Address address1 = addressRepository.findById(id).get();
        address1.setAddress(address.getAddress());
        address1.setAddress2(address.getAddress2());
        address1.setDistrict(address.getDistrict());
        address1.setPhone(address.getPhone());
        return addressRepository.save(address1);
    }

    public void deleteAddress(Integer id) {
        addressRepository.deleteById(id);
    }
}