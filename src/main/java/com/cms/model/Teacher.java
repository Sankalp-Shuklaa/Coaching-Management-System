package com.cms.model;

public class Teacher {
	protected int Tid;
	protected String Fullmame;
	protected String Email;
	protected String Skill;
	protected String MobileNo;
	protected String Address;
	protected String City;
	protected String State;
	protected int PostCode;
	protected int Cid;
	
	public Teacher(String fullmame, String email, String skill, String mobileNo, String address, String city,
			String state, int postCode, int cid) {
		super();
		Fullmame = fullmame;
		Email = email;
		Skill = skill;
		MobileNo = mobileNo;
		Address = address;
		City = city;
		State = state;
		PostCode = postCode;
		Cid = cid;
	}
	public Teacher(int tid, String fullmame, String email, String skill, String mobileNo, String address, String city,
			String state, int postCode, int cid) {
		super();
		Tid = tid;
		Fullmame = fullmame;
		Email = email;
		Skill = skill;
		MobileNo = mobileNo;
		Address = address;
		City = city;
		State = state;
		PostCode = postCode;
		Cid = cid;
	}
	public int getTid() {
		return Tid;
	}
	public void setTid(int tid) {
		Tid = tid;
	}
	public String getFullmame() {
		return Fullmame;
	}
	public void setFullmame(String fullmame) {
		Fullmame = fullmame;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getSkill() {
		return Skill;
	}
	public void setSkill(String skill) {
		Skill = skill;
	}
	public String getMobileNo() {
		return MobileNo;
	}
	public void setMobileNo(String mobileNo) {
		MobileNo = mobileNo;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public int getPostCode() {
		return PostCode;
	}
	public void setPostCode(int postCode) {
		PostCode = postCode;
	}
	public int getCid() {
		return Cid;
	}
	public void setCid(int cid) {
		Cid = cid;
	}
}
