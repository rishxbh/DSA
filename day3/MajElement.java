package day3;

public class MajElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {2,2,1,1,1,1,1,2,2};
		int ele = a[0];
		int cnt = 1;
		for(int i = 1; i < a.length; i++) {
			if(cnt == 0) {
				cnt = 1;
				ele = a[i];
			}
			else if(a[i] == ele) {
				cnt++;
			} else {
				cnt--;
			}
		}
		cnt = 0;
		for(int e : a) {
			if(e == ele) cnt++;
		}
		if(cnt > a.length / 2) System.out.println(ele);
		else System.out.println(-1);
	}

}
