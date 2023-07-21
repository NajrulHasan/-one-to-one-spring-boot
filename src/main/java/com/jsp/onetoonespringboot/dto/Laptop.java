package com.jsp.onetoonespringboot.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;
@Data
@Entity
public class Laptop {
	
	@Id
private int laptopId;
private String laptopName;
private Double laptopPrice;
@OneToOne
private Battery battery;

}
