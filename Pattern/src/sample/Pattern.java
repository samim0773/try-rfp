package sample;

import java.util.Scanner;

public class Pattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter row value: ");
		int row = sc.nextInt();
		System.out.println("Enter column value: ");
		int column = sc.nextInt();
		for(int i = 0; i < row; i ++)
		{
			for(int j=0; j<i;j++) {
				System.out.println("*");
			}
			System.out.println();
		}
		
	}

}
