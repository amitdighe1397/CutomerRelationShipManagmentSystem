package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.dao.CustomerDao;
import com.example.entity.emplCustomer;

@org.springframework.stereotype.Service

public class CustomerService implements CustomerServiceInf {

	@Autowired
	CustomerDao cd;

	@Override
	public emplCustomer getCustmorDetails11(emplCustomer emp) {

		emplCustomer empl = cd.save(emp);

		return empl;

	}

	@Override
	public emplCustomer updateCustmorDetails(emplCustomer emp, int id) {
		
		emplCustomer oldData = cd.findById(id).get();
		
		oldData.setLname(emp.getLname());
		oldData.setAge(emp.getAge());
		oldData.setCity(emp.getCity());
		oldData.setEmail(emp.getEmail());
		oldData.setName(emp.getName());
		oldData.setMob(emp.getMob());
		oldData.setLastvisit(emp.getLastvisit());

		emplCustomer updatedData = cd.save(oldData);
		
		return updatedData;
	}

	@Override
	public void deleteCust(int id) {

		cd.deleteById(id);

	}

	@Override
	public List<emplCustomer> getAll() {

		List<emplCustomer> list = cd.findAll();

		return list;

	}

}
