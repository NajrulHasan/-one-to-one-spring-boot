package com.jsp.onetoonespringboot.dto;

import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;


@Data
@Entity
public class Battery {
	@Id
	@Column(name = "serialnumber")
	private int batterySerialNumber;
	@Column(name = "voltage")
	private int batteryVoltage;
	@UpdateTimestamp
	private  String manufacturer;
	private int capacity;
	@OneToOne
	private Laptop laptop;

}
