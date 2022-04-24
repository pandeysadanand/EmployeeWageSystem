package com.bl.EmplyoyeeWage;

/*
 * @author : sadanand pandey
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class EmpWageBuilderUC12Main implements ComputeEmpWageIF {
	public static final int isPartTime = 1;
	public static final int isFullTime = 2;

	private int noOfCompany = 0;
	private LinkedList<CompanyEmpWageUC12> companyEmpWageList;

	public EmpWageBuilderUC12Main() {
		companyEmpWageList = new LinkedList<>();
	}

	public static void main(String[] args) {
		System.out.println("=========================================================");
		System.out.println("-----------Welcome to Employee Wage Program--------------");
		System.out.println("=========================================================");
		EmpWageBuilderUC12Main empWageBuilderUC12Main = new EmpWageBuilderUC12Main();
		empWageBuilderUC12Main.addCompanyEmpWage("DMart", 20, 15, 100);
		empWageBuilderUC12Main.addCompanyEmpWage("TCS", 25, 20, 120);
		empWageBuilderUC12Main.addCompanyEmpWage("Wipro", 22, 25, 110);
		empWageBuilderUC12Main.computeEmpWage();
	}

	/*
	 * passing parameter to constructor
	 */
	public void addCompanyEmpWage(String company, int empRatePerHour, int noOfWorkingDays, int maxHourPerMonth) {
		CompanyEmpWageUC12 companyEmpWageUC12 = new CompanyEmpWageUC12(company, empRatePerHour, noOfWorkingDays,
				maxHourPerMonth);
		companyEmpWageList.add(companyEmpWageUC12);
	}

	public void computeEmpWage() {
		for (int index = 0; index < companyEmpWageList.size(); index++) {
			CompanyEmpWageUC12 companyEmpWageUC12 = companyEmpWageList.get(index);
			companyEmpWageUC12.setTotalEmpWage(this.computeEmpWage(companyEmpWageUC12));
			System.out.println(companyEmpWageUC12);
			System.out.println("-----------------------------------------------");
		}
	}

	/*
	 * checking employee is working part time or full time and calculating employee
	 * wage
	 */
	private int computeEmpWage(CompanyEmpWageUC12 companyEmpWageUC12) {
		int empHrs = 0, totalWorkingdays = 0, totalEmpHours = 0;

		while (totalEmpHours <= companyEmpWageUC12.maxHours && totalWorkingdays < companyEmpWageUC12.numOfDays) {

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
			int empWagePerDay = empHrs * companyEmpWageUC12.empRate;
			System.out.println("Emp Wage Per Day : " + empWagePerDay);
		}
		System.out.println("-----------------------------------------------");
		return totalEmpHours * companyEmpWageUC12.empRate;
	}
}
