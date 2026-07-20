package com.shop;

import java.util.Scanner;

public class ShoppingCart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		double totalBill = 0;
		
		while(true) {
			System.out.println("===== SHOPPING CART =====");
			System.out.println("1. Rice - ₹50");
			System.out.println("2. Sugar - ₹40");
			System.out.println("3. Milk - ₹30");
			System.out.println("4. Biscuits - ₹20");
			System.out.println("5. Exit");
			
			System.out.print("Enter your choice: ");
			int choice = sc.nextInt();
			
			switch(choice) {

			case 1:
			    System.out.print("Enter quantity of Rice: ");
			    int qty = sc.nextInt();
			    totalBill = totalBill + (qty * 50);
			    System.out.println("Rice added to cart.");
			    break;

			case 5:
			    System.out.println("Final Bill = ₹" + totalBill);
			    System.out.println("Thank You for Shopping!");
			    sc.close();
			    return;

			default:
			    System.out.println("Invalid Choice!");
			}
		}
		
	}

}
