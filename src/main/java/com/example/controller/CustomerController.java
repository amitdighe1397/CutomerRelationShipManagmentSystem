package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.emplCustomer;
import com.example.service.CustomerServiceInf;

@RestController
@RequestMapping("/home")
public class CustomerController {

	@Autowired
	CustomerServiceInf csi;
	@GetMapping("/save")
	public emplCustomer getDetails(@RequestBody emplCustomer emp) {
		System.out.println(emp);
		emplCustomer empl = csi.getCustmorDetails11(emp);

		return empl;

	}

	@PutMapping("/Update/{pid}")
	public emplCustomer updateCust(@RequestBody emplCustomer emp,
			@PathVariable(value = "pid") int id) {

		emplCustomer empl = csi.updateCustmorDetails(emp,id);

		return empl;

	}

	@DeleteMapping("/remove/{id}")
	public String deleteCust(@PathVariable(value = "id") int id) {

		csi.deleteCust(id);

		return "Deleted Id is.....!" + id;

	}

	@GetMapping("/getall")
	public List<emplCustomer> getAll() {

		List<emplCustomer> list = csi.getAll();

		return list;

	}

}
