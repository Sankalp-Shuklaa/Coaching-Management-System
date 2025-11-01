package com.cms.model;

public class Course {
	protected int Cid;
	protected String CourseName;
	protected String Course_description;
	public Course(int cid, String courseName, String course_description) {
		super();
		Cid = cid;
		CourseName = courseName;
		Course_description = course_description;
	}
	public Course(String courseName, String course_description) {
		super();
		CourseName = courseName;
		Course_description = course_description;
	}
	public int getCid() {
		return Cid;
	}
	public void setCid(int cid) {
		Cid = cid;
	}
	public String getCourseName() {
		return CourseName;
	}
	public void setCourseName(String courseName) {
		CourseName = courseName;
	}
	public String getCourse_description() {
		return Course_description;
	}
	public void setCourse_description(String course_description) {
		Course_description = course_description;
	}
	
}
