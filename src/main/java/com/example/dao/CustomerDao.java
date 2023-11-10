package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.emplCustomer;

public interface CustomerDao extends JpaRepository<emplCustomer, Integer> {

	

}
