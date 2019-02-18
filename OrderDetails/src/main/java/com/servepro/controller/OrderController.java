package com.servepro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.servepro.repository.OrderRepository;
import com.servepro.util.OrderDetailsUtil;

@RestController
public class OrderController {
	
	@Autowired
	OrderRepository orderRepository;

	@PostMapping("/storeOrderDetails")
	public String storeOrderDetails(@RequestBody OrderDetailsUtil orderDetail) {
		
		OrderDetailsUtil stDetails = new OrderDetailsUtil();
		stDetails.setUserName(orderDetail.getUserName());
		stDetails.setEmail(orderDetail.getEmail());
		stDetails.setServiceCatName(orderDetail.getServiceCatName());
		stDetails.setSubServiceCatName(orderDetail.getSubServiceCatName());
		stDetails.setServiceTypeName(orderDetail.getServiceTypeName());
		stDetails.setSlotTiming(orderDetail.getSlotTiming());
		stDetails.setSlotDate(orderDetail.getSlotDate());
		stDetails.setOtherLocation(orderDetail.getOtherLocation());
		stDetails.setLastModifiedDate(orderDetail.getLastModifiedDate());
	    orderRepository.save(stDetails);
		return "success";
	}
}
