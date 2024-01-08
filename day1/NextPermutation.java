package day1;

import java.util.Arrays;

public class NextPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {3,2,1,4,6,2,6,1};
		int n = a.length;
		int breakpoint = -1;
		for(int i = n - 2; i >= 0; i--) {
			if(a[i] < a[i + 1]) {
				breakpoint = i;
				break;
			}
		}
		if(breakpoint == -1) {
			Arrays.sort(a);
		} else {
			for(int i = n - 1; i > breakpoint; i--) {
				if(a[breakpoint] < a[i]) {
					int temp = a[breakpoint];
					a[breakpoint] = a[i];
					a[i] = temp;
				}
			}
			int r = n - 1, l = breakpoint + 1;
			while(l <= r) {
                int temp = a[r];
                a[r] = a[l];
                a[l] = temp;
                l++; r--;
            }
		}
		for(int e : a) {
			System.out.print(e + " ");
		}
	}

}
