package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Alian {
	@Id
	private int aid;
	private String aname;
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	@Override
	public String toString() {
		return "Alian [aid=" + aid + ", aname=" + aname + "]";
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	

}
