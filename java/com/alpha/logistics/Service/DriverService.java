package com.alpha.logistics.Service;

import java.util.Optional;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.alpha.logistics.Dto.DriverDto;
import com.alpha.logistics.Dto.ResponseStructure;
import com.alpha.logistics.Entity.Carrier;
import com.alpha.logistics.Entity.Driver;
import com.alpha.logistics.Entity.Truck;
import com.alpha.logistics.Exception.CarrierNotFoundDataException;
import com.alpha.logistics.Exception.DriverNotFoundException;
import com.alpha.logistics.Exception.TruckNotFoundException;
import com.alpha.logistics.Repository.CarrierRepo;
import com.alpha.logistics.Repository.DriverRepo;
import com.alpha.logistics.Repository.TruckRepo;
@Service

public class DriverService {

	@Autowired
	private DriverRepo driverrepo;
	
	@Autowired
	private TruckRepo truckRepo;
	
	@Autowired
	private CarrierRepo carrierRepo;
	
	public ResponseEntity<ResponseStructure<Carrier>> saveDriver(DriverDto driver) {
		driverrepo.findById(driver.getId());
		
		Driver d=new Driver();
		d.setId(driver.getId());
		d.setName(driver.getName());
		d.setContact(driver.getContact());
		d.setCarrier(null);
		d.setTruck(null);
		
		driverrepo.save(d);
		
		ResponseStructure rs=new ResponseStructure();
		rs.setMessage("Driver Saved");
		rs.setStatuscode(HttpStatus.ACCEPTED.value());
		rs.setData(d);
		
		return new ResponseEntity<ResponseStructure<Carrier>>(rs,HttpStatus.ACCEPTED);
	}

	public ResponseEntity<ResponseStructure<Driver>> updateDriver(int driverid, int truckid, int carrierid) {
		Optional<Driver> driver=driverrepo.findById(driverid);
		if(!driver.isPresent()) {
			throw new DriverNotFoundException();
		}
		Optional<Truck>	truck=truckRepo.findById(truckid);
		if(!truck.isPresent()) {
			throw new TruckNotFoundException();
		}
		Optional<Carrier> carrier=carrierRepo.findById(carrierid);
		if(!carrier.isPresent()) {
			throw new CarrierNotFoundDataException();
		}
		
		Driver d=driver.get();
		d.setTruck(truck.get());
		d.setCarrier(carrier.get());
		
		Truck t=truck.get();
		t.setCarrier(carrier.get());
		
		driverrepo.save(d);
		truckRepo.save(t);
		
		ResponseStructure rs=new ResponseStructure();
		rs.setMessage("Driver Updated");
		rs.setStatuscode(HttpStatus.ACCEPTED.value());
		rs.setData(d);
		
		return new ResponseEntity<ResponseStructure<Driver>>(rs,HttpStatus.ACCEPTED);
	}
}
