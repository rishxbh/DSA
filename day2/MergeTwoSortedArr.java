package day2;

public class MergeTwoSortedArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,3,5,7};
		int b[] = {2,4,6,8,9};
		int ans[] = new int[a.length + b.length];
		int i = 0, j = 0, k = 0;
		while(i < a.length && j < b.length) {
			if(a[i] < b[j]) {
				ans[k] = a[i];
				i++;
			} else {
				ans[k] = b[j];
				j++;
			}
			k++;
		}
		while(i < a.length) {
			ans[k] = a[i];
			i++;
			k++;
		}
		while(j < b.length) {
			ans[k] = b[j];
			j++;
			k++;
		}
		for(int e : ans) {
			System.out.print(e + " ");
		}
	}

}
