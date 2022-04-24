package com.bl.EmplyoyeeWage;

import static java.lang.Math.floor;
import static java.lang.Math.random;

/**
 * @author sadanand pandey
 *
 */
public class EmpWageBuilderUC7 {
	final int partTime = 0;
	final int fullTime = 1;
	final int empPerHrRate = 20;
	final int numOfWorkingDay = 20;
	final int maxHrsInMonth = 100;

	public static void main(String[] args) {
		System.out.println("------Welcome to employee wage computation program-----------");
		System.out.println("===============================================================");
		System.out.println();
		EmpWageBuilderUC7 empWageBuilderUC7 = new EmpWageBuilderUC7();
		empWageBuilderUC7.computeEmpWage();
	}

	public int computeEmpWage() {
		int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
		/*
		 * checking part time and full time by using switch case
		 * calculating total wage 
		 */
		while (totalEmpHrs <= maxHrsInMonth && totalWorkingDays < numOfWorkingDay) {
			totalWorkingDays++;
			int empCheck = (int) Math.floor(random() * 10) % 3;
			switch (empCheck) {
			case 0:
				empHrs = 4;
				break;
			case 1:
				empHrs = 8;
				break;
			default:
				empHrs = 0;
			}
			totalEmpHrs += empHrs;
			System.out.println("Day: " + totalWorkingDays + " Emp hrs :   " + empHrs);
		}
		int totalEmpWage = totalEmpHrs * empPerHrRate;
		System.out.println("-----------------------------------");
		System.out.println("Total emp wage   : " + totalEmpWage);
		System.out.println("-----------------------------------");
		return totalEmpWage;
	}
}