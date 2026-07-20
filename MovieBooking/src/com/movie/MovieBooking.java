package com.movie;

import java.util.Scanner;

public class MovieBooking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			
			System.out.println("===== MOVIE TICKET BOOKING =====");
			System.out.println("1. Pushpa 3 - ₹200");
			System.out.println("2. Kalki - ₹180");
			System.out.println("3. Salaar - ₹150");
			System.out.println("4. Exit");
			
			System.out.print("Enter your choice: ");
			int choice = sc.nextInt();
			
			switch(choice) {

			case 1:
			    System.out.print("Enter number of tickets: ");
			    int tickets1 = sc.nextInt();
			    int total1 = tickets1 * 200;

			    System.out.println("Movie: Pushpa 3");
			    System.out.println("Total Amount: ₹" + total1);
			    break;

			case 2:
			    System.out.print("Enter number of tickets: ");
			    int tickets2 = sc.nextInt();
			    int total2 = tickets2 * 180;

			    System.out.println("Movie: Kalki");
			    System.out.println("Total Amount: ₹" + total2);
			    break;

			case 3:
			    System.out.print("Enter number of tickets: ");
			    int tickets3 = sc.nextInt();
			    int total3 = tickets3 * 150;

			    System.out.println("Movie: Salaar");
			    System.out.println("Total Amount: ₹" + total3);
			    break;

			case 4:
			    System.out.println("Thank you for visiting!");
			    sc.close();
			    return;

			default:
			    System.out.println("Invalid Choice!");
			    
			}
			sc.close();
	}

}
