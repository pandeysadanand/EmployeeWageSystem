package com.bl.EmplyoyeeWage;

import static java.lang.Math.floor;
import static java.lang.Math.random;

/**
 * @author sadanand pandey
 *
 */
public class EmpWageBuilderUC8 {
	final int partTime = 0;
	final int fullTime = 1;

	public static void main(String[] args) {
		System.out.println("------Welcome to employee wage computation program-----------");
		System.out.println("===============================================================");
		System.out.println();
		/*
		 * creating object and passing values
		 */
		EmpWageBuilderUC8 empWageBuilderUC7 = new EmpWageBuilderUC8();
		empWageBuilderUC7.computeEmpWage("DMart", 25, 20, 150);
		empWageBuilderUC7.computeEmpWage("VMart", 30, 22, 150);
		empWageBuilderUC7.computeEmpWage("Tata", 20, 25, 100);
	}

	/*
	 * created parameterized method to pass multiple values calculating total wage
	 * for every company
	 */
	public int computeEmpWage(String company, int empPerHrRate, int numOfWorkingDay, int maxHrsInMonth) {
		int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
		/*
		 * checking part time and full time using switch case calculating total wage
		 */
		while (totalEmpHrs <= maxHrsInMonth && totalWorkingDays < numOfWorkingDay) {
			totalWorkingDays++;
			int empCheck = (int) Math.floor(random() * 10) % 3;
			switch (empCheck) {
			case partTime:
				empHrs = 4;
				break;
			case fullTime:
				empHrs = 8;
				break;
			default:
				empHrs = 0;
			}
			totalEmpHrs += empHrs;
			System.out.println("Day: " + totalWorkingDays + " Emp hrs :   " + empHrs);
		}
		int totalEmpWage = totalEmpHrs * empPerHrRate;
		System.out.println("----------------------------------------------------------------");
		System.out.println("Total emp wage for company " + company + " is : " + totalEmpWage);
		System.out.println("----------------------------------------------------------------");
		return totalEmpWage;
	}
}