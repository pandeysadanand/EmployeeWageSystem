package com.bl.EmplyoyeeWage;

public class CompanyEmpWageUC12{
	
	public final String company;
	public final int empRate;
	public final int numOfDays;
	public final int maxHours;
	public int totalEmpWage;
	
	public CompanyEmpWageUC12(String company, int empRate, int numOfDays, int maxHours) {
		this.company = company;
		this.empRate = empRate;
		this.numOfDays = numOfDays;
		this.maxHours = maxHours;
	}
	
	public void setTotalEmpWage(int totalEmpWage) {
		this.totalEmpWage = totalEmpWage;
	}

	@Override
	public String toString() {
		return "Total emp wage for " + company + " is : " + totalEmpWage;
	}
}