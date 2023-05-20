package Practise;

import java.util.Scanner;

public class Reverse_Pyramid_Star_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter number of rows you want to print");
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();

		for (int i = row; i >= 1; i--) {

			for (int j = i - 1; j >= 1; j--) {
				System.out.print(j);
			}

			// System.out.print(i);
			System.out.print("\n");
		}

	}

}
