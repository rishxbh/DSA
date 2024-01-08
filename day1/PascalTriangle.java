package day1;

import java.util.ArrayList;
import java.util.List;

//Problem Statement: This problem has 3 variations. They are stated below:
//
//Variation 1: Given row number r and column number c. Print the element at position (r, c) in Pascal’s triangle.
//
//Variation 2: Given the row number n. Print the n-th row of Pascal’s triangle.
//
//Variation 3: Given the number of rows n. Print the first n rows of Pascal’s triangle.

public class PascalTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		List<List<Integer>> ans = new ArrayList<>();
		List<Integer> l = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			l.add(0,1);
			for(int j = 1; j < l.size() - 1; j++) {
				l.set(j, l.get(j) + l.get(j + 1));
			}
			ans.add(new ArrayList<Integer>(l));
		}
		for(int i = 0; i < ans.size(); i++) {
			List<Integer> list = ans.get(i);
			for(int j = 0; j < list.size(); j++) {
				System.out.print(list.get(j) + " ");
			}
			System.out.println();
		}
	}

}
