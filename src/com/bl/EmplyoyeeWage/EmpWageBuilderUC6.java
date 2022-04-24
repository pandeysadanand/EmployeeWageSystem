package com.bl.EmplyoyeeWage;

/**
 * @author sadanand pandey
 *
 */
public class EmpWageBuilderUC6 {

	public static void main(String[] args) {
		int num_of_working_days = 20;
		int perHourRate = 20;
		int max_Hrs_In_Month = 100;
		int empHrs = 0, empWage = 0, totalEmpHrs = 0, totalWorkingDays = 0;
		int totalEmpWage = 0;
		System.out.println("------Welcome to employee wage computation program-----------");
		System.out.println("===============================================================");
		System.out.println();
		/*
		 * checking employee is working part time or full time and calculating employee
		 * wage
		 */
		while (totalEmpHrs <= max_Hrs_In_Month && totalWorkingDays < num_of_working_days) {
			totalWorkingDays++;
			int empCheck = (int) Math.floor(Math.random() * 10) % 3;
			switch (empCheck) {
			case 0:
				empHrs = 8;
				break;
			case 1:
				empHrs = 4;
				break;
			default:
				empHrs = 0;
			}
			totalEmpHrs += empHrs;
			System.out.println("Day :" + " Emp Hrs:  " + empHrs);
		}
		totalEmpWage = totalEmpHrs * perHourRate;
		System.out.println("Total emp wage : " + totalEmpWage);
	}
}