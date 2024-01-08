package day1;

//Given an integer array arr, find the contiguous subarray (containing at least one number) which
//has the largest sum and returns its sum and prints the subarray.
public class KadaneAlgo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
		int maxSoFar = Integer.MIN_VALUE, max = 0;
		for(int i = 0; i < arr.length; i++) {
			max = Math.max(0, arr[i] + max);
			maxSoFar = Math.max(max, maxSoFar);
		}
		System.out.println(maxSoFar);
	}

}
