package com.alpha.logistics.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.alpha.logistics.Dto.ResponseStructure;

import com.alpha.logistics.Entity.Address;
import com.alpha.logistics.Exception.AddressAlreadyExist;
import com.alpha.logistics.Repository.AddressRepo;

@Service
public class addressService {
	 
	@Autowired
	AddressRepo addressrepo;
	public   ResponseEntity<ResponseStructure<Address>> saveAddress(Address address) {
		Optional<Address> findaddress=addressrepo.findById(address.getId());
		if(findaddress.isPresent()) {
			throw new AddressAlreadyExist();
		}
		addressrepo.save(address);
		ResponseStructure rs=new ResponseStructure();
		rs.setMessage("Address Saved");
		rs.setStatuscode(HttpStatus.ACCEPTED.value());
		rs.setData(address);
		return new ResponseEntity<ResponseStructure<Address>>(rs,HttpStatus.ACCEPTED);
		
	}

}
