package com.app.model;

public class Employee {
private int empId;

public Employee(int empId) {
	super();
	this.empId = empId;
}

public int getEmpId() {
	return empId;
}

public void setEmpId(int empId) {
	this.empId = empId;
}

@Override
public String toString() {
	return "Employee [empId=" + empId + "]";
}

}
