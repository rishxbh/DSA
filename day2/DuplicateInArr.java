package day2;

public class DuplicateInArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,3,4,2,2};
//		int freq[] = new int[a.length + 1];
//		for(int e : a) {
//			freq[e]++;
//			if(freq[e] == 2) {
//				System.out.println(e);
//				break;
//			}
//		}
		int slow = a[0];
		int fast = a[0];
		do {
			slow = a[slow];
			fast = a[a[fast]];
		} while(slow != fast);
		fast = a[0];
		while(slow != fast) {
			slow = a[slow];
			fast = a[fast];
		}
		System.out.println(slow);
	}

}
