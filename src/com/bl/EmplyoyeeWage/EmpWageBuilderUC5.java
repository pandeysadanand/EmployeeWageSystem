package com.bl.EmplyoyeeWage;

/**
 * @author sadanand pandey
 *
 */
public class EmpWageBuilderUC5 {

	public static void main(String[] args) {
		int workingDay = 20;
		int perHourRate = 20;
		int empHrs = 0, empWage = 0;
		int totalEmpWage = 0;
		System.out.println("------Welcome to employee wage computation program-----------");
		System.out.println("===============================================================");
		System.out.println();
		/*
		 * checking employee is working part time or full time and calculating employee
		 * wage
		 */
		for (int day = 0; day < workingDay; day++) {
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
			empWage = empHrs * perHourRate;
			totalEmpWage += empWage;
			System.out.println("Emp wage :       " + empWage);
		}
		System.out.println("-----------------------");
		System.out.println("Total Emp wage : " + totalEmpWage);
		System.out.println("-----------------------");
	}
}