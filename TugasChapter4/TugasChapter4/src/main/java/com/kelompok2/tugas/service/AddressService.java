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

    public void deleteAddress(Integer id) {
//        Film film1 = filmRepository.findById(id).get();
        addressRepository.deleteById(id);
    }
}
