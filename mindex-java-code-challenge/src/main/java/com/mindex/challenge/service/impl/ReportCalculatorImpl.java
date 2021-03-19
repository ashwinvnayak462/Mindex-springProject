package com.mindex.challenge.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import com.mindex.challenge.data.Employee;
import com.mindex.challenge.data.ReportingStructure;
import com.mindex.challenge.service.EmployeeService;

public class ReportCalculatorImpl {
	@Autowired
	private EmployeeService employeeService;

	public ReportCalculatorImpl(EmployeeService new_employeeService) {
		employeeService = new_employeeService;
	}

	public ReportingStructure getReportingStructure(String id) {
		Employee emp = employeeService.read(id);
		ReportingStructure rep = new ReportingStructure();
		rep.setEmployee(emp);
		rep.setNumberOfReports(getTotalReports(emp));
		return rep;

	}

	public int getTotalReports(Employee new_employee) {
		int reportCount = 0;
		if (new_employee.getDirectReports() == null) {
			return reportCount;
		} else {
			reportCount += new_employee.getDirectReports().size();
			for (Employee e : new_employee.getDirectReports()) {
				reportCount += getTotalReports(employeeService.read(e.getEmployeeId()));
			}
			return reportCount;
		}
	}
}
