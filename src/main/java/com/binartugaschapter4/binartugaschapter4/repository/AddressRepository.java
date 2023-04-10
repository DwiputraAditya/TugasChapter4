package com.binartugaschapter4.binartugaschapter4.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.binartugaschapter4.binartugaschapter4.models.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {
    
}
