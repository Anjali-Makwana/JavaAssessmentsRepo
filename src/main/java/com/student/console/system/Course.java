package com.student.console.system;

public class Course {

	private String courseId;
	private String courseName;
	private double courseFees;
	private String courseDuration;
	private String courseDetail;

	public Course(String courseId, String courseName, double courseFees, String courseDuration, String courseDetail) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.courseFees = courseFees;
		this.courseDuration = courseDuration;
		this.courseDetail = courseDetail;
	}

	public String getCourseId() {
		return courseId;
	}

	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public double getCourseFees() {
		return courseFees;
	}

	public void setCourseFees(double courseFees) {
		this.courseFees = courseFees;
	}

	public String getCourseDuration() {
		return courseDuration;
	}

	public void setCourseDuration(String courseDuration) {
		this.courseDuration = courseDuration;
	}

	public String getCourseDetail() {
		return courseDetail;
	}

	public void setCourseDetail(String courseDetail) {
		this.courseDetail = courseDetail;
	}

	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + ", courseFees=" + courseFees
				+ ", courseDuration=" + courseDuration + ", courseDetail=" + courseDetail + "]";
	}

}
