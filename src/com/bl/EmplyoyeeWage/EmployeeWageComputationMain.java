package com.bl.EmplyoyeeWage;

public class EmployeeWageComputationMain {

	private static final int IS_FULL_TIME = 1;
	private static final int IS_PART_TIME = 2;

	private int numberOfCompany = 0;
	private CompanyEmployeeWageUC10[] CompanyEmployeeWageUC10Array;

	public EmployeeWageComputationMain() {
		CompanyEmployeeWageUC10Array = new CompanyEmployeeWageUC10[5];
	}

	private void addCompanyEmployeeWageUC10(String company, int empRate, int numberOfDays, int maxHours) {
		CompanyEmployeeWageUC10Array[numberOfCompany] = new CompanyEmployeeWageUC10(company, empRate, numberOfDays,
				maxHours);
		numberOfCompany++;
	}

	private void computeEmployeeWage() {
		for (int index = 0; index < numberOfCompany; index++) {
			System.out.println();
			System.out.println("Employee in company : " + (index + 1));

			CompanyEmployeeWageUC10Array[index]
					.setEmpWagePerMonth(this.computeEmployeeWage(CompanyEmployeeWageUC10Array[index]));
			System.out.println(CompanyEmployeeWageUC10Array[index]);
		}
	}

	private int computeEmployeeWage(CompanyEmployeeWageUC10 companyEmployeeWageUC10) {

		int empHrs = 0, totalWorkingdays = 0, totalEmpHours = 0;

		while (totalEmpHours <= companyEmployeeWageUC10.maxHours
				&& totalWorkingdays < companyEmployeeWageUC10.numOfDays) {

			totalWorkingdays++;
			int empType = (int) Math.floor(Math.random() * 10) % 3;

			switch (empType) {
			case IS_FULL_TIME:
				empHrs = 8;
				break;
			case IS_PART_TIME:
				empHrs = 4;
				break;
			default:
				empHrs = 0;
			}

			totalEmpHours += empHrs;
			//System.out.println("Day : " + totalWorkingdays + " Emp Hrs : " + empHrs);
//		int empWagePerDay = empHrs * CompanyEmployeeWageUC10.empRate;
//			CompanyEmployeeWageUC10.empWagePerMonth += empWagePerDay;
//			System.out.println("Emp Wage Per Day : " + empWagePerDay);
		}
		return totalEmpHours * companyEmployeeWageUC10.empRate;
	}

	public static void main(String[] args) {

		System.out.println("----------------------------------------------------------");
		System.out.println("----- Welcome to Employee Wage Computation Program! -----");
		System.out.println("----------------------------------------------------------");
		EmployeeWageComputationMain employeeWageCmputation = new EmployeeWageComputationMain();
		employeeWageCmputation.addCompanyEmployeeWageUC10("TCS", 20, 12, 100);

		employeeWageCmputation.addCompanyEmployeeWageUC10("Infosys", 20, 18, 100);
		employeeWageCmputation.computeEmployeeWage();
	}
}