package com.alpha.logistics.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.alpha.logistics.Dto.ResponseStructure;
import com.alpha.logistics.Entity.Carrier;
import com.alpha.logistics.Exception.CarrierAlreadyExist;
import com.alpha.logistics.Exception.CarrierNotFoundDataException;
import com.alpha.logistics.Repository.CarrierRepo;

@Service
public class CarrierService {

	@Autowired
	CarrierRepo carrierrepo;
	
	public ResponseEntity<ResponseStructure<Carrier>> saveCarrier(Carrier carrier) {
   Optional<Carrier>	  findcarrier=carrierrepo.findById(carrier.getId());
	if(findcarrier.isPresent()) {
		throw new CarrierAlreadyExist();
	}
	carrierrepo.save(carrier);
	ResponseStructure rs=new ResponseStructure();
	rs.setMessage("Carrier Saved");
	rs.setStatuscode(HttpStatus.ACCEPTED.value());
	rs.setData(carrier);
	
	return new ResponseEntity<ResponseStructure<Carrier>>(rs,HttpStatus.ACCEPTED);
	
	
	
	}
	public Carrier find(int id) {
		Optional<Carrier> find=carrierrepo.findById(id);
		if(find.isPresent()) {
			return find.get();
		}
		else {
			throw new CarrierNotFoundDataException();
		}
	}
}
