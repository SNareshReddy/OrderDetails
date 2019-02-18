package com.servepro.util;

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
@Table(name="orderdetails")
public class OrderDetailsUtil {
    
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int sNo;
	@Column(name="userId",nullable = false,updatable = false,length=50,columnDefinition="varchar(60) default 'admin'")
	String userId;
	
	@Column(name="orgId",nullable=false,updatable=false,length=40,columnDefinition="INT NOT NULL default 1")
	private String orgId;
	private String userName;
	private String email;
	private String serviceCatName;
	private String subServiceCatName;
	private String serviceTypeName;
	private String slotTiming;
	
	@Temporal(TemporalType.DATE)
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date slotDate;
	private String otherLocation;
	private String status;
    private Date lastModifiedDate;
    
	public int getsNo() {
		return sNo;
	}
	public void setsNo(int sNo) {
		this.sNo = sNo;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getOrgId() {
		return orgId;
	}
	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getServiceCatName() {
		return serviceCatName;
	}
	public void setServiceCatName(String serviceCatName) {
		this.serviceCatName = serviceCatName;
	}
	public String getSubServiceCatName() {
		return subServiceCatName;
	}
	public void setSubServiceCatName(String subServiceCatName) {
		this.subServiceCatName = subServiceCatName;
	}
	public String getServiceTypeName() {
		return serviceTypeName;
	}
	public void setServiceTypeName(String serviceTypeName) {
		this.serviceTypeName = serviceTypeName;
	}
	public String getSlotTiming() {
		return slotTiming;
	}
	public void setSlotTiming(String slotTiming) {
		this.slotTiming = slotTiming;
	}
	public Date getSlotDate() {
		return slotDate;
	}
	public void setSlotDate(Date slotDate) {
		this.slotDate = slotDate;
	}
	public String getOtherLocation() {
		return otherLocation;
	}
	public void setOtherLocation(String otherLocation) {
		this.otherLocation = otherLocation;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getLastModifiedDate() {
		return lastModifiedDate;
	}
	public void setLastModifiedDate(Date lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}
    
    
}
