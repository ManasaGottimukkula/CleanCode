package com.epam.InterestCalculator;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Construction {
	public static void CostEstimation() {
		
		Scanner sc = new Scanner(System.in);
		PrintStream ps = new PrintStream(new FileOutputStream(FileDescriptor.out));
		ps.println("Choose one from the available materials..\n1. Construction with Standard materials\n2. Construction with above standard materials\n3. Construction with High standard materials\n4. Construction with High standard materials and fully automated home");
		try {
			int choose = sc.nextInt();
			double houseArea;
			switch(choose) {
			case 1:
				ps.println("Please enter the area of house in sqfts :");
				houseArea = sc.nextDouble();
				ps.println("Total estimated cost is " + (1200 * houseArea)+"Rs");
				break;
			case 2:
				ps.println("Please enter the area of house in sqfts :");
				houseArea = sc.nextDouble();
				ps.println("Total estimated cost is " + (1500 * houseArea)+"Rs");
				break;
			case 3:
				ps.println("Please enter the area of house in sqfts :");
				houseArea = sc.nextDouble();
				ps.println("Total estimated cost is " + (1800 * houseArea)+"Rs");
				break;
			case 4:
				ps.println("Please enter the area of house in sqfts :");
				houseArea = sc.nextDouble();
				ps.println("Total estimated cost is " + (2500 * houseArea)+"Rs");
				break;
			default:
				ps.println("Select from the above options!");
			}
		}
			catch(Exception e) {
				ps.println("Invalid input!!");
		}
		
	}
}
