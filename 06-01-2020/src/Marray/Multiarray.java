package Marray;

import java.util.*;

public  class Multiarray {

	int a[][] = new int[5][5];
	int b[][] = new int[5][5];
	int c[][] = new int[5][5];

	public void createarray() {
		for (int i = 0; i <= 5; i++)
			for (int j = 0; j <= 5; j++) {

				System.out.println("enter elements of first matrix");
				Scanner sc = new Scanner("System.in");
 
			}
		for (int i = 0; i <= 5; i++)
			for (int j = 0; j <= 5; j++) {

				System.out.println("enter elements of second matrix");
				Scanner sc = new Scanner("System.in");
				b[i][j]= sc.nextInt();
			}

		for (int i = 0; i <= 5; i++)
			for (int j = 0; j <= 5; j++) {
				Scanner sc = new Scanner("System.in");
				System.out.println(" elements of third  matrix");
				c[i][j] = a[i][j] + b[i][j];

			}
		

	}

	public void display() {
		System.out.println("sum of matrices is");
		for(int i=0;i<=5;i++)
			for(int j=0;j<=5;j++) {
				Scanner sc = new Scanner("System.in");
				c[i][j]=sc.nextInt();
			}

	}

}
