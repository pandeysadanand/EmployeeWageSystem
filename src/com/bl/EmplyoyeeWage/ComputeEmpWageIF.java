package com.bl.EmplyoyeeWage;

public interface ComputeEmpWageIF {
	public void addCompanyEmpWage(String company, int empPerHourRate, int noOfWorkingDays, int MaxHourPerMonth);
	public void computeEmpWage();
}
