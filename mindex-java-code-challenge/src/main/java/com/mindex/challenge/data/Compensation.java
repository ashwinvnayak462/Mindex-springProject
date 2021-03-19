package com.mindex.challenge.data;

public class Compensation {
	private Employee employee;
	private int salary;
	private String effectiveDate;

    public Compensation() {
    }

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee new_employee) {
		this.employee = new_employee;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int new_salary) {
		this.salary = new_salary;
	}

	public String getEffectiveDate() {
		return effectiveDate;
	}

	public void setEffectiveDate(String new_effectiveDate) {
		this.effectiveDate = new_effectiveDate;
	}
}
