package com.jsp.onetoonespringboot.controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.jsp.onetoonespringboot.Dao.LaptopBatteryDao;
import com.jsp.onetoonespringboot.dto.Laptop;
import com.jsp.onetoonespringboot.repository.LaptopRepository;

public class LaptopBatteryController {

	@Autowired
	private LaptopBatteryDao laptopBatteryDao;
	public Laptop saveLaptop(Laptop laptop) {
		return laptopBatteryDao.saveLaptop(laptop);
		}
}
