package com.jsp.onetoonespringboot.Dao;

import org.springframework.beans.factory.annotation.Autowired;

import com.jsp.onetoonespringboot.dto.Battery;
import com.jsp.onetoonespringboot.dto.Laptop;
import com.jsp.onetoonespringboot.repository.BatteryRepository;
import com.jsp.onetoonespringboot.repository.LaptopRepository;

public class LaptopBatteryDao {
	@Autowired
	private LaptopRepository laptopRepository;
	@Autowired
	private BatteryRepository batteryRepository;
	public Laptop saveLaptop(Laptop laptop) {
		
	return laptopRepository.save(laptop);
	
		
	}
	
}
