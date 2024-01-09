package day2;

//Given a matrix, your task is to rotate the matrix 90 degrees clockwise.

public class RotateMatrixBy90 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = {{0,0,0,0},{1,1,1,1},{2,2,2,2},{3,3,3,3}};
		for(int i = 0; i < a.length; i++) {
			for(int j = i + 1; j < a[0].length; j++) {
				swap(a, i, j, j, i);
			}
		}
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[0].length / 2; j++) {
				swap(a, i, j, i, a[0].length - 1 - j);
			}
		}
		for(int[] arr : a) {
			for(int e : arr) {
				System.out.print(e + " ");
			}
			System.out.println();
		}
	}
	private static void swap(int[][] a, int i, int j, int k, int l) {
		int temp = a[i][j];
		a[i][j] = a[k][l];
		a[k][l] = temp;
	}

}
