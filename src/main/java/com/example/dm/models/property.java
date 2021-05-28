package com.example.dm.models;

import java.io.Serializable;
import java.sql.Blob;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="property")
@Table(name="properites")
public class property implements  Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column
	private String location;
	@Column
	private String type;
	@Column
	private String area;
	
	@Column
	private String describtion;
	
	@Column private double price;
	@Column private String photo1;
	@Column private String photo2;
	@Column private String photo3;
	@Column private String photo4;
	@Column private String photo5;
	public property() {}
	
	
	public int getId() {
		return id;
	}
	/**
	 * @param id
	 * @param location
	 * @param type
	 * @param area
	 * @param describtion
	 * @param price
	 * @param photo1
	 * @param photo2
	 * @param photo3
	 * @param photo4
	 * @param photo5
	 */
	public property(int id, String location, String type, String area, String describtion, double price, String photo1,
			String photo2, String photo3, String photo4, String photo5) {
		this.id = id;
		this.location = location;
		this.type = type;
		this.area = area;
		this.describtion = describtion;
		this.price = price;
		this.photo1 = photo1;
		this.photo2 = photo2;
		this.photo3 = photo3;
		this.photo4 = photo4;
		this.photo5 = photo5;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getArea() {
		return this.area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getDescribtion() {
		return this.describtion;
	}
	public void setDescribtion(String describtion) {
		this.describtion = describtion;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	
	public String getPhoto1() {
		return photo1;
	}


	public void setPhoto1(String photo1) {
		this.photo1 = photo1;
	}


	public String getPhoto2() {
		return photo2;
	}


	public void setPhoto2(String photo2) {
		this.photo2 = photo2;
	}


	public String getPhoto3() {
		return photo3;
	}


	public void setPhoto3(String photo3) {
		this.photo3 = photo3;
	}


	public String getPhoto4() {
		return photo4;
	}


	public void setPhoto4(String photo4) {
		this.photo4 = photo4;
	}


	public String getPhoto5() {
		return photo5;
	}


	public void setPhoto5(String photo5) {
		this.photo5 = photo5;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	
	
}
