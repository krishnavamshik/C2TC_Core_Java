package com.cg.placement;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.cg.college.College;

@Entity
public class Placement {
	private int pid;
	private String name;
	private College college;
	private LocalDate date;
	private String qualifiacation;
	private int year;
	
	public Placement() {
		super();
	}

	public Placement(int pid, String name, College college, LocalDate date, String qualifiacation, int year) {
		super();
		this.pid = pid;
		this.name = name;
		this.college = college;
		this.date = date;
		this.qualifiacation = qualifiacation;
		this.year = year;
	}
	@Id
	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public College getCollege() {
		return college;
	}

	public void setCollege(College college) {
		this.college = college;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public String getQualifiacation() {
		return qualifiacation;
	}

	public void setQualifiacation(String qualifiacation) {
		this.qualifiacation = qualifiacation;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Placement [pid=" + pid + ", name=" + name + ", college=" + college + ", date=" + date
				+ ", qualifiacation=" + qualifiacation + ", year=" + year + ", getPid()=" + getPid() + ", getName()="
				+ getName() + ", getCollege()=" + getCollege() + ", getDate()=" + getDate() + ", getQualifiacation()="
				+ getQualifiacation() + ", getYear()=" + getYear() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	
	

}
