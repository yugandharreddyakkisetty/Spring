package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Alian {
    @Id
    @GeneratedValue
	private int aid;
	private String aname;
	private String lang;
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
		return "Alian [aid=" + aid + ", aname=" + aname + ", lang=" + lang + "]";
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getLang() {
		return lang;
	}
	public void setLang(String lang) {
		this.lang = lang;
	}
}
