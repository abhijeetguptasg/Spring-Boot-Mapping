package com.example.numetry.Springboot_OTO.dto;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Person {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String name;
	long phone;
	String adress;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "fk_adhaar_id")
	private Adhaar adhaar;

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

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public Adhaar getAdhaar() {
		return adhaar;
	}

	public void setAdhaar(Adhaar adhaar) {
		this.adhaar = adhaar;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", phone=" + phone + ", adress=" + adress + ", adhaar=" + adhaar
				+ "]";
	}
	
	

}
