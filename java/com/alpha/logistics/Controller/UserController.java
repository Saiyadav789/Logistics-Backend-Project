package com.alpha.logistics.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alpha.logistics.Dto.OrderDto;
import com.alpha.logistics.Dto.ResponseStructure;
import com.alpha.logistics.Entity.Order;
import com.alpha.logistics.Service.OrderService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private OrderService orderserv;
	
	@PostMapping("/placeuserOrder")
	public ResponseEntity<ResponseStructure<Order>> savecargo(@RequestBody OrderDto c) {
		return orderserv.placeuserOrder(c);
	}
	@PostMapping("/updateOrder")
	public ResponseEntity<ResponseStructure<Order>> updateOrder(@RequestParam  int orderid,int truckid) {
	 return	orderserv.updateOrder(orderid,truckid);
	}
	
}
