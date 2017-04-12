package com.demo.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "card")
public class Card {
	private long id;
	private String number;
	private String	owner;
	private Date valid;
	private Date expiration;
	private String CLASS;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "id", unique = true, nullable = false)
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	@Column(name="number",unique=true,nullable=false)
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	@Column(name="owner",nullable=false)
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	@Column(name="valid")
	@JsonFormat(pattern="dd-MM-yyyy")
	
	public Date getValid() {
		return valid;
	}
	public void setValid(Date valid) {
		this.valid = valid;
	}
	@Column(name="expire")
	@JsonFormat(pattern="dd-MM-yyyy")
	
	public Date getExpiration() {
		return expiration;
	}
	public void setExpiration(Date expiration) {
		this.expiration = expiration;
	}
	@Column(name="class")
	public String getCLASS() {
		return CLASS;
	}
	public void setCLASS(String cLASS) {
		CLASS = cLASS;
	}
}
