package com.alpha.logistics.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.alpha.logistics.Dto.ResponseStructure;
import com.alpha.logistics.Dto.TruckDto;
import com.alpha.logistics.Entity.Truck;
import com.alpha.logistics.Exception.TruckAlreadyExist;
import com.alpha.logistics.Repository.TruckRepo;

@Service
public class TruckService {

	@Autowired
	private TruckRepo truckrepo;
	
	
	public ResponseEntity<ResponseStructure<Truck>> saveTruck(TruckDto truck) {
		Truck t=new Truck();
		t.setId(truck.getId());
		t.setName(truck.getName());
		t.setNumber(truck.getNumber());
		t.setCapacity(truck.getCapacity());
		t.setCarrier(null);
	truckrepo.save(t);
	ResponseStructure rs=new ResponseStructure();
	rs.setMessage("Truck Saved");
	rs.setStatuscode(HttpStatus.ACCEPTED.value());
	rs.setData(t);
	
	return new ResponseEntity<ResponseStructure<Truck>>(rs,HttpStatus.ACCEPTED);
		
	}

}
