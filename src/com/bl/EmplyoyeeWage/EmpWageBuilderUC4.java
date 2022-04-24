package com.bl.EmplyoyeeWage;

/**
 * @author sadanand pandey
 *
 */
public class EmpWageBuilderUC4 {

	public static void main(String[] args) {

		int perHourRate = 20;
		int empHrs = 0, empWage = 0;
		int empCheck = (int) Math.floor(Math.random() * 10) % 3;
		System.out.println("------Welcome to employee wage computation program-----------");
		System.out.println("===============================================================");
		System.out.println();
		/*
		 * checking employee is working part time or full time and calculating employee
		 * wage
		 */
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
		System.out.println("Emp wage : " + empWage);
	}
}
