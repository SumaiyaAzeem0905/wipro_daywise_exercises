package com.springCollege.CollegeAppEx2;

public class College {

	 private String collegeName;
	    private Department department;

	    // Constructor
	    public College(String collegeName, Department department) {
	        this.collegeName = collegeName;
	        this.department = department;
	    }

	    @Override
	    public String toString() {
	        return "College{" +
	               "collegeName='" + collegeName + '\'' +
	               ", department=" + department +
	               '}';
	    }
}
