package com.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class emplCustomer {

	int id;
	String name;
	String lname;
	String email;
	String mob;
	String city;
	String lastvisit;
	int age;

	@Id
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMob() {
		return mob;
	}

	public void setMob(String mob) {
		this.mob = mob;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getLastvisit() {
		return lastvisit;
	}

	public void setLastvisit(String lastvisit) {
		this.lastvisit = lastvisit;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", lname=" + lname + ", email=" + email + ", mob=" + mob
				+ ", city=" + city + ", lastvisit=" + lastvisit + ", age=" + age + "]";
	}

}
