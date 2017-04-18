// Mike Vealey
// CSIT 211 - Spring 2017

public class PascalsTriangle {
	private int rows = 0;
	private int numArray[][];
	
	public PascalsTriangle(int iRows) {
		rows = iRows;
		numArray = new int[rows][rows];
	}

	public void buildArray() {
		for (int rowIndex = 0; rowIndex < rows; rowIndex++) {
			for (int colIndex = 0; colIndex <= rowIndex; colIndex++) {
				buildTable(rowIndex, colIndex);
			}
		}
	}
	
	public int buildTable(int rowIndex, int colIndex) {
		if (colIndex == 0) {
			//first column is always '1'
			numArray[rowIndex][colIndex] = 1;
			return 1;
		} else if (colIndex == rowIndex) {
			//last column is always '1'
			numArray[rowIndex][colIndex] = 1;
			return 1;
		} else {
			//calculate the next position's value
			numArray[rowIndex][colIndex] = buildTable(rowIndex - 1, colIndex - 1) + buildTable(rowIndex - 1, colIndex);
			return numArray[rowIndex][colIndex];
		}
	}
	
	public void printLastRow() {
		System.out.print("Row " + rows + ": ");
		for (int colIndex = 0; colIndex < rows; colIndex++) {
			System.out.print(numArray[rows-1][colIndex] + " ");
		}
	}
}
