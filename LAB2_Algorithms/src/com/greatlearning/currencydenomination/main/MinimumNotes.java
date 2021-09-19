package com.greatlearning.currencydenomination.main;

import java.util.Scanner;

import com.greatlearning.currencydenomination.MergeSortImplementation;

public class MinimumNotes {
	
	private static Scanner sc = new Scanner(System.in);
	public static boolean status;
	
	public static void main(String[] args) {
		
		int SIZE,notes[],AMOUNT,i;
		
         //get the number of denominations
		System.out.println("Enter the size of currency denominations:");
		SIZE = sc.nextInt();
		
		//allocate array to hold denominations
		notes = new int[SIZE];
		System.out.println("Enter the currency denomination value:");
		
		//get the denominations in loop
		for (i = 0; i < SIZE; i++) 
		{
			notes[i] = sc.nextInt();
		}
		
		
		
		//sort using merge sort
		MergeSortImplementation ms = new MergeSortImplementation();
		ms.sort(notes,0,notes.length -1);
		
		//get the amount
		System.out.println("Enter the amount you want to pay:");
		AMOUNT = sc.nextInt();	
		
		int[] noteCounter = new int[SIZE];
		// count notes 
		for (i= 0; i < notes.length; i++) {
			if (AMOUNT >= notes[i]) {
				noteCounter[i] = AMOUNT / notes[i];
				AMOUNT = AMOUNT - noteCounter[i] * notes[i];
				}
			if (i==notes.length-1 && AMOUNT!=0) {
				System.out.println("Not Possible to Pay!!");
				status = true;
					}
				}
		
				
	     //print notes
		if (status == false) {
		 System.out.println("Your payment approach in order to give minium number of notes will be:");
		for (i = 0; i < notes.length; i++) {
		  if (noteCounter[i] != 0) {
				System.out.println(notes[i] + " : "+ noteCounter[i]);
					         }
				    }
			   }
			}
	}
