package com.mindex.challenge.data;

public class ReportingStructure {
	private Employee employee;
	private int numberOfReports;
	
    public ReportingStructure() {
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee new_employee) {
        this.employee = new_employee;
    }

	public int getNumberOfReports() {
		return numberOfReports;
	}
	
	public void setNumberOfReports(int new_numberOfReports) {
		this.numberOfReports = new_numberOfReports; 
	}
}
