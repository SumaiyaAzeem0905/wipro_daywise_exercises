
package com.springCollege.CollegeAppEx2;

public class Department {
	
	 private String deptName = "Computer Science";
	    private int deptCode = 101;

	    // Getters and Setters
	    public String getDeptName() {
	        return deptName;
	    }
	    public void setDeptName(String deptName) {
	        this.deptName = deptName;
	    }

	    public int getDeptCode() {
	        return deptCode;
	    }
	    public void setDeptCode(int deptCode) {
	        this.deptCode = deptCode;
	    }

	    @Override
	    public String toString() {
	        return "Department{" +
	               "deptName='" + deptName + '\'' +
	               ", deptCode=" + deptCode +
	               '}';
	    }

}
