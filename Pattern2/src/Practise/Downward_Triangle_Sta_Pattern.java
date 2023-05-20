package Practise;

import java.util.Scanner;

public class Downward_Triangle_Sta_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
	           * * * * * * * 
               * * * * * * 
               * * * * * 
               * * * * 
               * * * 
               * * 
               *	 
		 
		   
		 
		 
		 
		 
		 
		 
		 */

		System.out.println("Enter number of rows you want to print");
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();

		for (int i = 1; i <= row; i++) {
			for (int j = row; j >= i; j--) {
				System.out.print("* ");

			}
			System.out.print("\n");
		}
	}

}
