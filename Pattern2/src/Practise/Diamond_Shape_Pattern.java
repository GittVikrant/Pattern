package Practise;

import java.util.Scanner;

public class Diamond_Shape_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 
		 
	  * 
    * * * 
  * * * * * 
* * * * * * * 
  * * * * * 
    * * * 
      * 
   
	
	
	
	
	*/  	
		System.out.println("Enter number of rows you want to print");
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		for (int i = 1; i <= row; i++) {
			for (int k = row - 1; k >= i; k--)
				System.out.print("  ");
			for (int j = 1; j <= (i * 2) - 1; j++)
				System.out.print("* ");

			System.out.print("\n");

		}

		for (int i = row - 1; i >= 1; i--) {
			for (int k = row - 1; k >= i; k--)
				System.out.print("  ");
			for (int j = 1; j <= (i * 2) - 1; j++)
				System.out.print("* ");

			System.out.print("\n");

		}
	}

}
