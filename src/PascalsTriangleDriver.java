// Mike Vealey
// CSIT 211 - Spring 2017

import java.util.Scanner;

public class PascalsTriangleDriver {

	public static void main(String[] args) {
		int rowNumber = 0;
		int finalRow;
		PascalsTriangle pt;
		
		//get the row number to calculate to
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the row number: ");
		rowNumber = scan.nextInt();
		scan.close();

		pt = new PascalsTriangle(rowNumber);
		pt.buildArray();
		pt.printLastRow();
		
	}
	
}
