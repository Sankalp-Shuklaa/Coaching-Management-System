package com.cms.model;

public class Student {
	protected int Sid;
	protected String Fullmame;
	protected String Student_Class;
	protected String Instution_Name;
	protected String PhoneNo;
	protected String Address;
	protected String City;
	protected String State;
	protected int PostCode;
	protected int Cid;
	protected String Student_Password;
	public Student(int sid, String fullmame, String class1, String instution_Name, String phoneNo, String address,
			String city, String state,  int cid, int postCode, String student_Password) {
		super();
		Sid = sid;
		Fullmame = fullmame;
		Student_Class = class1;
		Instution_Name = instution_Name;
		PhoneNo = phoneNo;
		Address = address;
		City = city;
		State = state;
		PostCode = postCode;
		Cid = cid;
		Student_Password = student_Password;
	}
	
	public Student(String fullmame, String student_Class, String instution_Name, String phoneNo, String address,
			String city, String state, int postCode, int cid, String student_Password) {
		super();
		Fullmame = fullmame;
		Student_Class = student_Class;
		Instution_Name = instution_Name;
		PhoneNo = phoneNo;
		Address = address;
		City = city;
		State = state;
		PostCode = postCode;
		Cid = cid;
		Student_Password = student_Password;
	}

	public Student(String fullname, String student_Class2, String instution_Name2, String phoneNo2, String address2,
			String city2, String state2, String postcode2, String cid2, String student_Password2) {
		// TODO Auto-generated constructor stub
	}

	public int getSid() {
		return Sid;
	}
	public void setSid(int sid) {
		Sid = sid;
	}
	public String getFullmame() {
		return Fullmame;
	}
	public void setFullmame(String fullmame) {
		Fullmame = fullmame;
	}
	public String getStudent_Class() {
		return Student_Class;
	}
	public void setStudent_Class(String student_Class) {
		Student_Class = student_Class;
	}
	public String getInstution_Name() {
		return Instution_Name;
	}
	public void setInstution_Name(String instution_Name) {
		Instution_Name = instution_Name;
	}
	public String getPhoneNo() {
		return PhoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		PhoneNo = phoneNo;
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
	public String getStudent_Password() {
		return Student_Password;
	}
	public void setStudent_Password(String student_Password) {
		Student_Password = student_Password;
	}
	
}
