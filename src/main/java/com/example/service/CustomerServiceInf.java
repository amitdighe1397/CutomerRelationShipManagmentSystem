package com.example.service;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;

import com.example.entity.emplCustomer;

public interface CustomerServiceInf {

	emplCustomer getCustmorDetails11(emplCustomer emp);

	emplCustomer updateCustmorDetails(emplCustomer emp,int id);
	
//	emplCustomer updateCust(emplCustomer emp);
	void deleteCust(int id); 
	 List<emplCustomer> getAll();

}
