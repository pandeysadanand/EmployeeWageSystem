package com.bl.EmplyoyeeWage;

/**
 * @author sadanand pandey
 *
 */
public class EmpWageBuilderUC3 {

	public static void main(String[] args) {
		int is_Full_Time = 0;
		int is_Part_Time = 1;
		int perHourRate = 20;
		int empHrs = 0, empWage = 0;
		double empCheck = Math.floor(Math.random() * 10) % 3;
		System.out.println("------Welcome to employee wage computation program-----------");
		System.out.println("===============================================================");
		System.out.println();
		/*
		 * checking employee is present or not and calculating employee wage
		 */
		if (empCheck == is_Full_Time) {
			empHrs = 8;
			empWage = empHrs * perHourRate;
			System.out.println("Total employee wage : " + empWage);
		}else if(empCheck == is_Part_Time) {
			empHrs = 4;
			empWage = empHrs * perHourRate;
			System.out.println("Total employee wage : " + empWage);
		}
		else {
			empHrs = 0;
			empWage = empHrs * perHourRate;
			System.out.println("Total employee wage : " + empWage);
		}
	}
}
