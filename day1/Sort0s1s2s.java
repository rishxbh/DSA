package day1;

public class Sort0s1s2s {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {2,0,2,1,1,0};
		int i = 0, j = 0, k = a.length - 1;
		while(i <= k) {
			if(a[i] == 0) {
				swap(i,j,a);
				j++;
				i++;
			} else if (a[i] == 1) {
				i++;
			} else {
				swap(i,k,a);
				k--;
			}
		}
		for(int e : a) {
			System.out.print(e + " ");
		}
	}

	private static void swap(int i, int j, int[] a) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

}
