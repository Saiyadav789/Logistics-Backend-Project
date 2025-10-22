package com.alpha.logistics.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alpha.logistics.Entity.Address;

@Repository
public interface AddressRepo extends JpaRepository<Address,Integer>{

}
