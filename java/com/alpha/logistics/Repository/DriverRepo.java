package com.alpha.logistics.Repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alpha.logistics.Entity.Driver;

@Repository
public interface DriverRepo extends JpaRepository<Driver,Integer>{

}
