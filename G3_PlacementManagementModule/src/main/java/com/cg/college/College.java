package com.cg.college;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.cg.user.User;

@Entity
public class College {
	private int cid;
	private User collegeAdmin;
	private String collegeName;
	private String location;
	
	public College() {
		super();
	}

	public College(int cid, User collegeAdmin, String collegeName, String location) {
		super();
		this.cid = cid;
		this.collegeAdmin = collegeAdmin;
		this.collegeName = collegeName;
		this.location = location;
	}
	@Id
	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public User getCollegeAdmin() {
		return collegeAdmin;
	}

	public void setCollegeAdmin(User collegeAdmin) {
		this.collegeAdmin = collegeAdmin;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "College [cid=" + cid + ", collegeName=" + collegeName + ", location=" + location + ", getCid()="
				+ getCid() + ", getCollegeName()=" + getCollegeName() + ", getLocation()=" + getLocation()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
	

}
