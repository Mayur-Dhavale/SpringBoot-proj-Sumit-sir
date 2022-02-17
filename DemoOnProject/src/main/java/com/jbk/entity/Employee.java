package com.jbk.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Employee implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@OneToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="cid")
	private Country country;

	private String name;
	private String status;
	private String department;
	
	private String phoneno;
	
	@Temporal(value = TemporalType.TIMESTAMP)
	@Column(name = "createddtm",nullable = false)
	private Date createddtm;
	
	private String createby;
	
	@Temporal(value = TemporalType.TIMESTAMP)
	@Column(name = "updateddtm",nullable = false)
	private Date updateddtm;
	
	private String updatedby;
	
	public Employee() {
		
	}

	public Employee(Integer id, Country country, String name, String status, String department, String phoneno,
			Date createddtm, String createby, Date updateddtm, String updatedby) {
		super();
		this.id = id;
		this.country = country;
		this.name = name;
		this.status = status;
		this.department = department;
		this.phoneno = phoneno;
		this.createddtm = createddtm;
		this.createby = createby;
		this.updateddtm = updateddtm;
		this.updatedby = updatedby;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}

	public Date getCreateddtm() {
		return createddtm;
	}

	public void setCreateddtm(Date createddtm) {
		this.createddtm = createddtm;
	}

	public String getCreateby() {
		return createby;
	}

	public void setCreateby(String createby) {
		this.createby = createby;
	}

	public Date getUpdateddtm() {
		return updateddtm;
	}

	public void setUpdateddtm(Date updateddtm) {
		this.updateddtm = updateddtm;
	}

	public String getUpdatedby() {
		return updatedby;
	}

	public void setUpdatedby(String updatedby) {
		this.updatedby = updatedby;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", country=" + country + ", name=" + name + ", status=" + status + ", department="
				+ department + ", phoneno=" + phoneno + ", createddtm=" + createddtm + ", createby=" + createby
				+ ", updateddtm=" + updateddtm + ", updatedby=" + updatedby + "]";
	}
	
	
}
