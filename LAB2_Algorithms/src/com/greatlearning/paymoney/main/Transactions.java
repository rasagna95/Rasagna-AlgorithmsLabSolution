package com.greatlearning.paymoney.main;

import java.util.Scanner;

public class Transactions {
	
	private static Scanner sc = new Scanner(System.in);
	
		public static void main(String[] args) {
		
			
			int SIZE,TARGET_SIZE,TARGET_VALUE = 0,i,j,SUM;
			int transactions[];
			
			System.out.println("Enter the size of transaction array:");
			
			// get the size of transactions from user
			SIZE = sc.nextInt();
			// allocate an array of provided size
			transactions = new int[SIZE];
			
			System.out.println("Enter the values of array:");

			// get the elements of the array (in a loop)
			for (i = 0; i < SIZE; i++) 
			{
				transactions[i] = sc.nextInt();
			}
			
			// get the number of targets
			System.out.println("Enter the total number of Targets:");
			TARGET_SIZE = sc.nextInt();
			
			// loop so many times (as number of targets)
			for (i = 0; i < TARGET_SIZE; i++) 
			{
				// get the target
			System.out.println("Enter the value of target:");
			TARGET_VALUE = sc.nextInt();
			
			// again start a loop to calculate the sum
			SUM =0;
			for (j = 0; j < transactions.length; j++) {
				// sum till the element
				SUM = SUM+transactions[j];
				// check if target is reached
				if ( SUM >= TARGET_VALUE) {
					// print out the number of transactions when target is reached
					System.out.println("Target acheived after "+( j+1 )+" transactions");
					 // We stop execution of the closest (inner) for loop
					break;
			}
				
				// we reached the final transaction and target is still not reached
				if(j==transactions.length-1 && SUM < TARGET_VALUE) {
					System.out.println("Given Target is not reached");
				}
				
			}
			
		}

   }
}
