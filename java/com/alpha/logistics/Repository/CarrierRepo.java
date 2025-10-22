package com.alpha.logistics.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alpha.logistics.Entity.Carrier;

@Repository
public interface CarrierRepo extends JpaRepository<Carrier,Integer> {

}
