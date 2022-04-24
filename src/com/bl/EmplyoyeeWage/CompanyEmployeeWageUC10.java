package com.bl.EmplyoyeeWage;

public class CompanyEmployeeWageUC10{
	
	public final String company;
	public final int empRate;
	public final int numOfDays;
	public final int maxHours;
	public int empWagePerMonth;
	
	public CompanyEmployeeWageUC10(String company, int empRate, int numOfDays, int maxHours) {
		this.company = company;
		this.empRate = empRate;
		this.numOfDays = numOfDays;
		this.maxHours = maxHours;
	}
	
	public void setEmpWagePerMonth(int totalEmpWage) {
		this.empWagePerMonth = totalEmpWage;
	}
	
	@Override
	public String toString() {
		return "Total emp wage for Company " + company + " is : " + empWagePerMonth;
	}
}