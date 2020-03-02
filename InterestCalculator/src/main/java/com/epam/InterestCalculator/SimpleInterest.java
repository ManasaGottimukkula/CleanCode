package com.epam.InterestCalculator;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class SimpleInterest {
	
	
	public static void simpleInterestCalculator() {
	Scanner sc = new Scanner(System.in);
	PrintStream ps = new PrintStream(new FileOutputStream(FileDescriptor.out));
	ps.print("Please enter principle amount :");
	try {
		double prAmount = sc.nextDouble();
		ps.println("Enter the time period");
		double timePeriod = sc.nextDouble();
		ps.println("Enter the rate of interest per year");
		double rateInterest = sc.nextDouble();
		double simpInt = (prAmount * timePeriod * rateInterest) / 100;
		double cmpInt = (prAmount * Math.pow(1 + (rateInterest/100), timePeriod)) - prAmount;
		ps.println("Simple Interest is :" + simpInt+"Rs");
		ps.println("Compound Interest is :"+ cmpInt+"Rs");
	}
	catch(Exception e) {
		ps.println("Invalid input!\nEnter the valid one!");
	}
}

}
