package com.aditya.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Aliens {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String name;
	private String email;
	private String phone;
	private String afrom;
	private String desti;
	private String date;
	
	public Aliens() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Alien(String name, String email, String phone, String from, String to, String date, String afrom, String desti) {
		super();
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.afrom = afrom;
		this.desti = desti;
		this.date = date;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAfrom() {
		return afrom;
	}

	public void setFrom(String afrom) {
		this.afrom = afrom;
	}

	public String getDesti() {
		return desti;
	}

	public void setDesti(String desti) {
		this.desti = desti;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Alien [name=" + name + ", email=" + email + ", phone=" + phone + ", from=" + afrom + ", to=" + desti
				+ ", date=" + date + "]";
	}
	
}
