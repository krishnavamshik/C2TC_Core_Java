package com.cg.user;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
	private int uid;
	private String name;
	private String type;
	private String password;
	public User() {
		super();
	}
	public User(int uid, String name, String type, String password) {
		super();
		this.uid = uid;
		this.name = name;
		this.type = type;
		this.password = password;
	}
	@Id
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [uid=" + uid + ", name=" + name + ", type=" + type + ", password=" + password + ", getUid()="
				+ getUid() + ", getName()=" + getName() + ", getType()=" + getType() + ", getPassword()="
				+ getPassword() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
}
