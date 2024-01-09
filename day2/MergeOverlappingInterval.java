package day2;

import java.util.ArrayList;

import java.util.List;
import java.util.Stack;
import java.util.Arrays;

//Given an array of intervals, merge all the overlapping 
//intervals and return an array of non-overlapping intervals.
public class MergeOverlappingInterval {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr= {{1,3},{2,6},{8,10},{15,18}};
		Arrays.sort(arr, (int[] a, int[]b) -> a[0] - b[0]);
//		List<List<Integer>> ans = new ArrayList<>();
//		for (int i = 0; i < arr.length; i++) { // select an interval:
//            int start = arr[i][0];
//            int end = arr[i][1];
//            if (!ans.isEmpty() && end <= ans.get(ans.size() - 1).get(1)) {
//                continue;
//            }
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[j][0] <= end) {
//                    end = Math.max(end, arr[j][1]);
//                } else {
//                    break;
//                }
//            }
//            ans.add(Arrays.asList(start, end));
//        }
//        int[][] anss = new int[ans.size()][2];
//		for(int i = 0; i < ans.size(); i++) {
//			anss[i][0] = ans.get(i).get(0);
//			anss[i][1] = ans.get(i).get(1);
//		}
//		for(int[] arrr : anss) {
//			for(int e : arrr) {
//				System.out.print(e + " ");
//			}
//			System.out.println();
//		}
		Stack<int[]> st = new Stack<>();
		st.push(arr[0]);
		for(int i = 1; i < arr.length; i++) {
			int a[] = st.peek();
			int b[] = arr[i];
			if(a[1] >= b[0]) {
				st.pop();
				a[1] = b[1];
				st.push(a);
			} else {
				st.push(b);
			}
		}
		int arrrr[][] = new int[st.size()][2];
		int k = st.size() - 1;
		while(st.size() > 0) {
			arrrr[k] = st.pop();
			k--;
		}
		for(int[] arrr : arrrr) {
			for(int e : arrr) {
				System.out.print(e + " ");
			}
			System.out.println();
		}
	}

}
