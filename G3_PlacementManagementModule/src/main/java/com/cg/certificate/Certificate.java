package com.cg.certificate;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.cg.college.College;

@Entity
public class Certificate {
	private int ceid;
	private int year;
	private College college;
	public Certificate() {
		super();
	}
	public Certificate(int ceid, int year, College college) {
		super();
		this.ceid = ceid;
		this.year = year;
		this.college = college;
	}
	@Id
	public int getCid() {
		return ceid;
	}
	public void setCid(int cid) {
		this.ceid = cid;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public College getCollege() {
		return college;
	}
	public void setCollege(College college) {
		this.college = college;
	}
	@Override
	public String toString() {
		return "Certificate [cid=" + ceid + ", year=" + year + ", college=" + college + ", getCid()=" + getCid()
				+ ", getYear()=" + getYear() + ", getCollege()=" + getCollege() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
}
