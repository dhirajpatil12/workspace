package com.te.phoneSimulator;

public class Contactlist {
    private  String contactName;
    private long contactNo;
    
	public Contactlist(String contactName, long contactNo) {
		super();
		this.contactName = contactName;
		this.contactNo = contactNo;
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public long getContactNo() {
		return contactNo;
	}

	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}

	@Override
	public String toString() {
		return "User [contactName=" + contactName + ", contactNo=" + contactNo + "]";
	}
	
	
	

	
	
	
	
}

