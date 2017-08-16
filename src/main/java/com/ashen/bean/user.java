package com.ashen.bean;

public class user{
	
	int id;
	String userName;	
	long age;
	
	public user() {
		super();
	}
	public user(int i, String userName,long age) {
		super();
		this.id = i;
		this.userName = userName;
		this.age=age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getuserName() {
		return userName;
	}
	public void setuserName(String userName) {
		this.userName = userName;
	}
	public long getage() {
		return age;
	}
	public void setage(long age) {
		this.age = age;
	}	
	
}