package day2;

public class RepeatingAndMissing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {3,1,2,5,3};
		long n = a.length; 
        long SN = (n * (n + 1)) / 2;
        long S2N = (n * (n + 1) * (2 * n + 1)) / 6;
        long S = 0, S2 = 0;
        for (int i = 0; i < n; i++) {
            S += a[i];
            S2 += (long)a[i] * (long)a[i];
        }
        long val1 = S - SN;
        long val2 = S2 - S2N;
        val2 = val2 / val1;
        long x = (val1 + val2) / 2;
        long y = x - val1;

        
        System.out.println("Repeating: "+x + " Missing: " + y);
	}

}
