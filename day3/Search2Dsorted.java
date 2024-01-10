package day3;

//You have been given a 2-D array ‘mat’ of size ‘N x M’ 
//where ‘N’ and ‘M’ denote the number of rows and columns, 
//respectively. The elements of each row are sorted in non-decreasing 
//order. Moreover, the first element of a row is greater than the 
//last element of the previous row (if it exists). You are given an integer 
//‘target’, and your task is to find if it exists in the given ‘mat’ or not.



public class Search2Dsorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = {{1,2,4},{6,7,8},{9,10,34}};
		int target = 34;
		int i = 0, j = a[0].length - 1;
		while(i < a.length && j >= 0) {
			if(a[i][j] == target) {
				System.out.println(i + " " + j);
				break;
			} else if (a[i][j] < target) {
				i++;
			} else {
				j--;
			}
		}
	}

}
