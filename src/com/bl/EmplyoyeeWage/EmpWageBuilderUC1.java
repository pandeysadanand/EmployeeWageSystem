package com.bl.EmplyoyeeWage;

public class EmpWageBuilderUC1 {
	/**
	 * @author sadanand pandey
	 *
	 */
	public static void main(String[] args) {
		int is_Full_Time = 0;
		System.out.println("=========================================================");
		System.out.println("-----------Welcome to Employee Wage Program--------------");
		System.out.println("=========================================================");
		double empCheck = Math.floor(Math.random() * 10) % 2;
		/*
		 * checking employee is present or absent
		 */
		if (empCheck == is_Full_Time) {
			System.out.println("Employee is present.");
		} else {
			System.out.println("Employee is absent.");
		}
	}
}