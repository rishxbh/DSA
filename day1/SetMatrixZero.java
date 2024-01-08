package day1;

//Problem Statement: Given a matrix if an element in the matrix is 0 
//then you will have to set its entire column and row to 0 and then return the matrix.

public class SetMatrixZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] matrix= {{1,1,1},{1,0,1},{1,1,1}};
		for (int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[0].length; j++) {
				if(matrix[i][j] == 0) {
					matrix[0][j] = 0;
					matrix[i][0] = 0;
				}
			}
		}
		for (int i = 0; i < matrix.length; i++) {
			if(matrix[i][0] == 0) {
				for(int j = 0; j < matrix[0].length; j++) {
					matrix[i][j] = 0;
				}
			}
		}
			
		for(int j = 0; j < matrix[0].length; j++) {
			if(matrix[0][j] == 0) {
				for (int i = 0; i < matrix.length; i++) {
					matrix[i][j] = 0;
				}
			}
		}
			
		for(int[] e : matrix) {
			for(int ee : e) {
				System.out.print(ee + " ");
			}
			System.out.println();
		}
		
	}

}
