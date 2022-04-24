package com.bl.EmplyoyeeWage;
/*
 * @author: Sadanand pandey
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

import com.bl.EmplyoyeeWage.CompanyEmpWageUC13;
import com.bl.EmplyoyeeWage.ComputeEmpWageIF;

public class EmpWageBuilderUC13Main implements ComputeEmpWageIF {
	public static final int isPartTime = 1;
	public static final int isFullTime = 2;

	private int noOfCompany = 0;
	private LinkedList<CompanyEmpWageUC13> companyEmpWageList;

	public EmpWageBuilderUC13Main() {
		companyEmpWageList = new LinkedList<>();
	}

	/*
	 * passing values to constructor amd calling computeEmpWage method
	 */
	public static void main(String[] args) {
		System.out.println("=========================================================");
		System.out.println("-----------Welcome to Employee Wage Program--------------");
		System.out.println("=========================================================");
		EmpWageBuilderUC13Main empWageBuilderUC13Main = new EmpWageBuilderUC13Main();
		empWageBuilderUC13Main.addCompanyEmpWage("DMart", 20, 15, 100);
		empWageBuilderUC13Main.addCompanyEmpWage("TCS", 25, 20, 120);
		empWageBuilderUC13Main.addCompanyEmpWage("Wipro", 22, 25, 110);
		empWageBuilderUC13Main.computeEmpWage();
	}

	/*
	 * setting values to parameters and storing in linkedList
	 */
	public void addCompanyEmpWage(String company, int empRatePerHour, int noOfWorkingDays, int maxHourPerMonth) {
		CompanyEmpWageUC13 companyEmpWageUC13 = new CompanyEmpWageUC13(company, empRatePerHour, noOfWorkingDays,
				maxHourPerMonth);
		companyEmpWageList.add(companyEmpWageUC13);
	}

	public void computeEmpWage() {
		for (int index = 0; index < companyEmpWageList.size(); index++) {
			CompanyEmpWageUC13 companyEmpWageUC13 = companyEmpWageList.get(index);
			companyEmpWageUC13.setTotalEmpWage(this.computeEmpWage(companyEmpWageUC13));
			System.out.println(companyEmpWageUC13);
			System.out.println("-----------------------------------------------");
		}
	}

	/*
	 * checking employee is working part time or full time and 
	 * calculating per day employee wage
	 * and also total wage
	 */
	private int computeEmpWage(CompanyEmpWageUC13 companyEmpWageUC13) {
		int empHrs = 0, totalWorkingdays = 0, totalEmpHours = 0;

		while (totalEmpHours <= companyEmpWageUC13.maxHours && totalWorkingdays < companyEmpWageUC13.numOfDays) {

			totalWorkingdays++;
			int empType = (int) Math.floor(Math.random() * 10) % 3;

			switch (empType) {
			case isFullTime:
				empHrs = 8;
				break;
			case isPartTime:
				empHrs = 4;
				break;
			default:
				empHrs = 0;
			}

			totalEmpHours += empHrs;
			int empWagePerDay = empHrs * companyEmpWageUC13.empRate;
			System.out.println("Emp Wage Day " + totalWorkingdays + " : " + empWagePerDay);
		}
		System.out.println("-----------------------------------------------");
		return totalEmpHours * companyEmpWageUC13.empRate;
	}
}
