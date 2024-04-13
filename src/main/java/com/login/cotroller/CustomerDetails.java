package com.login.cotroller;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class CustomerDetails {
	
	@Id 
	private long number;
	private String name;
	private String address;
	private String bread;
	private String gender;
	private int age;
	private String imgurl;
	private String price;
	public CustomerDetails(long number, String name, String address, String bread, String gender, int age,
			String imgurl, String price) {
		super();
		this.number = number;
		this.name = name;
		this.address = address;
		this.bread = bread;
		this.gender = gender;
		this.age = age;
		this.imgurl = imgurl;
		this.price = price;
	}
	public CustomerDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getNumber() {
		return number;
	}
	public void setNumber(long number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getBread() {
		return bread;
	}
	public void setBread(String bread) {
		this.bread = bread;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getImgurl() {
		return imgurl;
	}
	public void setImgurl(String imgurl) {
		this.imgurl = imgurl;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	
}
