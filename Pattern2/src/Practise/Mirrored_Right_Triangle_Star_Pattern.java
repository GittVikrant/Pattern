package Practise;

import java.util.Scanner;

public class Mirrored_Right_Triangle_Star_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 
  		   * 
         * * 
       * * * 
     * * * * 
   * * * * * 
 * * * * * * 

		  
		  
		  
		  
		 
		 */

		System.out.println("Enter number of rows you want to print");
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();

		for (int i = 1; i <= row; i++) {
			for (int j = row; j >= i; j--) {
				System.out.print("  ");
			}

			for (int k = 1; k <= i; k++) {
				System.out.print("* ");
			}

			System.out.print("\n");
		}

	}

}
